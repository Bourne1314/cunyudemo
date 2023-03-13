package com.cunyu.ServiceMonday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceMondayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMondayApplication.class, args);
		System.out.println("======================");
		System.out.println("========Monday========");
		System.out.println("======================");
	}
}
