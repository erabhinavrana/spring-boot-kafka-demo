package com.abhi.springbootkafkademo.controller;

import com.abhi.springbootkafkademo.producer.SimpleMessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/kafka-demo")
public class MessageController {

    private final SimpleMessageProducer simpleMessageProducer;

    @GetMapping("/publish")
    public String publishSimpleMessage(@RequestParam String message) {
        simpleMessageProducer.sendMessage(message);
        return "Message Published Successfully!";
    }
}
