package com.abhi.springbootkafkademo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class JsonMessageProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendJsonMessage(Object message) {
        log.info("Sending message: {}", message);
        kafkaTemplate.send("kafka-topic-json", message);
    }
}
