package com.cunyu.ServiceMonday.Controller;


import com.cunyu.ServiceMonday.Client.TestFeign;
import com.cunyu.ServiceMonday.Config.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MondayMorningController {
    @Autowired
    TestFeign testFeign;

    @Value("${local.variable.alpha:2}")
    private String alpha;

    @RequestMapping("/getNacos")
    public void testNacos(){
        System.out.println(alpha);
        System.out.println("====nacos====");
    }

    @RequestMapping("/testFeign")
    public Integer testFeign1(){
        System.out.println("====nacos====");
        return testFeign.TestFeign1(3);
    }


}
