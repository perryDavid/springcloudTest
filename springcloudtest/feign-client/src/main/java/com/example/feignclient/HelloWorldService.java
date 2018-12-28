package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HELLO",fallback = ErrorControllers.class)
public interface HelloWorldService {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();

    @RequestMapping(value = "/user/index",method = RequestMethod.GET)
    String getIndex();
}
