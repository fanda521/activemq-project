package com.jeffrey.springbootactivemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfigure {
 
    @Value("${queue}") // 这里是去读取到yml文件中的queue的名称
    private String queue;
 
    @Bean
    public ActiveMQQueue zqjQueue(){
        return new ActiveMQQueue(queue); //返回new 一个activeMQ队列的对象，放入对列名称
    }
 
}