package com.jeffrey.springbootactivemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
 
@Component
public class SendServer {
 
 
    @Autowired
    private Queue queue;  // jms的队列，这里的queue对象是通过Configure类生产出来的
 
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate; //消息发送对象
 
    public void sendMsg(String msg) {
        jmsMessagingTemplate.convertAndSend(queue, msg); //通过传入queue 对象参数 和 消息对
        //象。将msg数据发送到指定的queue队列中去
    }
 
}