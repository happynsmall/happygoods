package com.springboot.microservices.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HappygoodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappygoodsApplication.class, args);
	}

}
