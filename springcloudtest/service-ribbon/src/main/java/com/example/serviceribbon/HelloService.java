package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public  String getHelloContent()
    {
        return  restTemplate.getForObject("http://SERVICE-HELLO/",String.class);
    }
}
