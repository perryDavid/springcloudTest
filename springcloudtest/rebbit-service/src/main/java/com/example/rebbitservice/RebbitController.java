package com.example.rebbitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RebbitController {
    @Autowired
    private  Sender sender;

    @RequestMapping("/")
    public void say()
    {
        sender.send();
    }
}
