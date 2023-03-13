package com.cunyu.ServiceSaturday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.cunyu.ServiceSaturday.mapper")
@SpringBootApplication
@EnableDiscoveryClient
//@EnableScheduling
@EnableFeignClients
public class ServiceSaturdayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSaturdayApplication.class, args);
        System.out.println("======================");
        System.out.println("========Saturday========");
        System.out.println("======================");
    }
}