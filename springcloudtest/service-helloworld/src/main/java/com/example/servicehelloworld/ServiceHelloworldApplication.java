package com.example.servicehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHelloworldApplication.class, args);
	}

	@RequestMapping("/")
	public String getNewDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
		return dateFormat.format(new Date()) + "66666666666666666666666";
	}

}

