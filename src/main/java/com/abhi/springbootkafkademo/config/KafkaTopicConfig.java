package com.abhi.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    NewTopic simpleMessageTopic() {
        return TopicBuilder.name("kafka-topic-simple").build();
    }

    @Bean
    NewTopic jsonMessageTopic() {
        return TopicBuilder.name("kafka-topic-json").build();
    }
}
