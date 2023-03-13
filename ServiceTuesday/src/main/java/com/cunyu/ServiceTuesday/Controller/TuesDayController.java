package com.cunyu.ServiceTuesday.Controller;


import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class TuesDayController {

    @RequestMapping("/getNacos")
    public void testNacos(){
        System.out.println("====nacos====");
    }

}
