package com.example.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {

   /* @Autowired*/
    @Resource
    private  HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String sayHello()
    {
        return  helloWorldService.sayHello();
    }

    @RequestMapping("/getIndex")
    public String getIndex()
    {
        return  helloWorldService.getIndex();
    }
}
