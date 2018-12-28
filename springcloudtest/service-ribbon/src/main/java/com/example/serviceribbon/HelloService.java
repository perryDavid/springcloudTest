package com.example.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failMethod")
    public  String getHelloContent()
    {
        System.out.println("call SERVICE-HELLO");
        return  restTemplate.getForObject("http://SERVICE-HELLO/",String.class);
    }

    private   String failMethod()
    {
        return "hello world service is not available !";
    }
}
