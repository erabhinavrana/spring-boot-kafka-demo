package com.abhi.springbootkafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonMessageConsumer {

    @KafkaListener(topics = "kafka-topic-json", groupId = "kafka-demo-group")
    public void consumeJsonMessage(Object message) {
        log.info("Received message: {}", message);
    }
}
