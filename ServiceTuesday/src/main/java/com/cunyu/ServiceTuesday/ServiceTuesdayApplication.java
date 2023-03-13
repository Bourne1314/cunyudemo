package com.cunyu.ServiceTuesday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceTuesdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTuesdayApplication.class, args);
		System.out.println("======================");
		System.out.println("========Tuesday========");
		System.out.println("======================");

	}

}
