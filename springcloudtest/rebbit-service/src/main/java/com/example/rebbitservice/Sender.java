package com.example.rebbitservice;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate template;

    public void  send()
    {
        String msg = "hello world! this is a time  begin:" + new Date().toString();
        System.out.println(msg);
        template.convertAndSend("hello",msg);
    }
}
