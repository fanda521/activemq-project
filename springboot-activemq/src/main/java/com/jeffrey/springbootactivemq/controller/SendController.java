package com.jeffrey.springbootactivemq.controller;

import com.jeffrey.springbootactivemq.service.SendServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
 
 
    @Autowired
    SendServer sendServer;
 
    @RequestMapping("/send")
    public String receiveMsg(String msg) {
 
        try {
            sendServer.sendMsg(msg);
            return "msg Send Success : " + msg;
        }catch (Exception e){
            e.printStackTrace();
            return "msg Send Faild";
        }
    }
 
}