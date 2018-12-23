package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeTestController {
    @RequestMapping(value = "/hello")
     public  String  index()
     {
         return  "111111";
     }
}
