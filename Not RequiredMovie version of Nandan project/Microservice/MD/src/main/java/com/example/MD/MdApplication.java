package com.example.MD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdApplication.class, args);
	}

}
