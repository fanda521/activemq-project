package com.jeffrey.springbootactivemqconsumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "${queue}") //这个就是去获取队列名称然后监听这个队列的注解
    public void receive(String msg) {
        System.out.println("监听器收到msg:" + msg);
    }
}