package com.example.feignclient;

import org.springframework.stereotype.Component;

@Component
public class ErrorControllers implements   HelloWorldService {

    @Override
    public String sayHello() {
        return "hello world service is not available !";
    }

    @Override
    public String getIndex() {
        return "hello world service is not available123 !";
    }
}
