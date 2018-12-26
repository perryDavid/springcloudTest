package com.example.servceconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RefreshScope
@EnableEurekaClient
public class ServiceConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigClientApplication.class, args);
    }

    @Value("${hello}")
    private  String hello;

    @RequestMapping("/hello")
    public  String  getHello()
    {
        return hello;
    }



}

