package com.cunyu.ServiceMonday.Controller;

import com.cunyu.ServiceMonday.Config.R;
import com.cunyu.ServiceMonday.Config.RedisUtil;
import com.cunyu.ServiceMonday.Entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;

/**
 * @program: springbootdemo
 * @Date: 2019/1/25 15:03
 * @Author: Mr.Zheng
 * @Description:
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;
//======================String===============================
    @RequestMapping("sset")
    public boolean redisset(String key, String value,Integer expireTime){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());
        System.out.println(userEntity.getId());

        return redisUtil.set(key,userEntity,expireTime);

//        return redisUtil.set(key,value);
    }

    @RequestMapping("sget")
    public Object redisget(String key){
        return redisUtil.get(key);
    }
//======================HashMap===============================
    @RequestMapping("hmget")
    public Object redishmget(String key){
        return redisUtil.hmget(key);
    }
    @RequestMapping("hmset")
    public R redihmset(@RequestParam String key, @RequestBody HashMap<String,Object> map, @RequestParam Integer time){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());
        System.out.println(userEntity.getId());
        long expireTime = Long.valueOf(time);

        return R.ok().put("result",redisUtil.hmset(key,map,expireTime));

//        return redisUtil.set(key,value);
    }
//======================List========================================
//    @RequestMapping("hmget")
//    public Object redishmget(String key){
//        return redisUtil.hmget(key);
//    }
//    @RequestMapping("hmset")
//    public R redihmset(@RequestParam String key, @RequestBody HashMap<String,Object> map, @RequestParam Integer time){
//        UserEntity userEntity =new UserEntity();
//        userEntity.setId(Long.valueOf(1));
//        userEntity.setGuid(String.valueOf(1));
//        userEntity.setName("zhangsan");
//        userEntity.setAge(String.valueOf(20));
//        userEntity.setCreateTime(new Date());
//        System.out.println(userEntity.getId());
//        long expireTime = Long.valueOf(time);
//
//        return R.ok().put("result",redisUtil.hmset(key,map,expireTime));
//
////        return redisUtil.set(key,value);
//    }



    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }
}