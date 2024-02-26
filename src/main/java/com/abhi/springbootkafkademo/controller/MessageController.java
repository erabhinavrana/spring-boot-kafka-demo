package com.abhi.springbootkafkademo.controller;

import com.abhi.springbootkafkademo.producer.JsonMessageProducer;
import com.abhi.springbootkafkademo.producer.SimpleMessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/kafka-demo")
public class MessageController {

    public static final String MESSAGE_PUBLISHED_SUCCESSFULLY = "Message Published Successfully!";
    private final SimpleMessageProducer simpleMessageProducer;
    private final JsonMessageProducer jsonMessageProducer;

    @GetMapping("/publish")
    public String publishSimpleMessage(@RequestParam String message) {
        simpleMessageProducer.sendMessage(message);
        return MESSAGE_PUBLISHED_SUCCESSFULLY;
    }

    @PostMapping("/publish")
    public String publishJsonMessage(@RequestBody Object message) {
        jsonMessageProducer.sendJsonMessage(message);
        return MESSAGE_PUBLISHED_SUCCESSFULLY;
    }
}
