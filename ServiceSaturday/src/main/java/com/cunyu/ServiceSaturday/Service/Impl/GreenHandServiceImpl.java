package com.cunyu.ServiceSaturday.Service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cunyu.ServiceSaturday.Entity.GreenHand;
import com.cunyu.ServiceSaturday.Mapper.GreenHandMapper;
import com.cunyu.ServiceSaturday.Service.GreenHandService;
import org.springframework.stereotype.Service;



@Service
public class GreenHandServiceImpl extends ServiceImpl<GreenHandMapper, GreenHand> implements GreenHandService {
}