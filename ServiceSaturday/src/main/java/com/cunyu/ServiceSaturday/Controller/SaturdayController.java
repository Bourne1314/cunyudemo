package com.cunyu.ServiceSaturday.Controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cunyu.ServiceSaturday.Entity.GreenHand;
import com.cunyu.ServiceSaturday.Service.GreenHandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SaturdayController {

    @RequestMapping("/getNacos")
    public void testNacos(){
        System.out.println("====nacos====");
    }

    @Value("${goods}")
    public String goods;

    @GetMapping("/config")
    public String config(){
        return "this goods is " + goods;
    }

    @Autowired
    GreenHandService greenHandService;

    @RequestMapping(value="/getGreenHand",method = RequestMethod.GET)
    public List<GreenHand> list(){
        System.out.println("--------------菜鸟表list-------------");
        List<GreenHand> greenHands = greenHandService.list();
        return greenHands;
    }

    @RequestMapping(value = "feign",method = RequestMethod.GET)
    public Integer testFeign(@RequestParam Integer Id){
        System.out.println(Id);
        return Id;
    }

//    @RequestMapping(value="/getGreenHandBySql",method = RequestMethod.GET)
//    public GreenHand listBySql(@RequestParam Integer age){
//        System.out.println("--------------菜鸟表list-------------");
//        GreenHand greenHand = greenHandService.greenHandSql(age);
//        String ids = greenHand.getCity();
//        String ids1 = ids.replaceAll(" ","");
//        String demosub = ids1.substring(1,ids1.length()-1);
//        String demoArray[] = demosub.split(",");
//        List<String> demoList = Arrays.asList(demoArray);
//        System.out.println(demoList);
//        return greenHand;
//    }

    @RequestMapping(value="/addGreenHand",method = RequestMethod.POST)
    public Boolean addGreenHand(@RequestBody GreenHand greenHand){
        System.out.println("--------------菜鸟表insert-------------");
        Boolean isSuccess = greenHandService.save(greenHand);
        return isSuccess;
    }

    @RequestMapping(value="/removeGreenHandById",method = RequestMethod.DELETE)
    public Boolean removeGreenHandById(@RequestParam Integer Id){
        System.out.println("--------------菜鸟表delete-------------");
        Boolean isSuccess = greenHandService.removeById(Id);
        return isSuccess;
    }

    @RequestMapping(value="/updateGreenHandById",method = RequestMethod.POST)
    public Boolean updateGreenHandById(@RequestBody GreenHand greenHand){
        System.out.println("--------------菜鸟表update-------------");
        Boolean isSuccess = greenHandService.updateById(greenHand);
        return isSuccess;
    }

    @RequestMapping(value="/listGreenHandByPage",method = RequestMethod.GET)
    public List<GreenHand> listByPage(@RequestParam Integer page,Integer size){
        System.out.println("--------------菜鸟表listByPage-------------");
        IPage<GreenHand> greenHandIPage = new Page<>(page,size);
        greenHandIPage = greenHandService.getBaseMapper().selectPage(greenHandIPage,null);
        List<GreenHand> greenHands = greenHandIPage.getRecords();
        return greenHands;
    }

}
