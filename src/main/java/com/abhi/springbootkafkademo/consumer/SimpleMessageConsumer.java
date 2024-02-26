package com.abhi.springbootkafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SimpleMessageConsumer {

    @KafkaListener(topics = "kafka-topic-simple", groupId = "kafka-demo-group")
    public void consume(String message) {
        log.info("Received message: {}", message);
    }
}
