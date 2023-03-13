package com.cunyu.ServiceWednesday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ServiceWednesdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceWednesdayApplication.class, args);
	}

}
