package com.BackendWithJava.KafkaDemo.controller;

import com.BackendWithJava.KafkaDemo.service.KafkaDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaDemoService kafkaDemoService;

    @GetMapping("/")
    public String getDummyData(){
        return "DummyData";
    }

    @PostMapping("/postToKafka")
    public String postMessagetoKafka(@RequestBody String message){
       return kafkaDemoService.sendMessage(message);

    }
}
