package com.tikie.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TikieEurekaConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TikieEurekaConfigClientApplication.class, args);
	}
}
