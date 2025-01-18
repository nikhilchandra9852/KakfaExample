package com.example.kafkaproducerexample.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaTopicConfig {


    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("nikhilTopic").build();
    }
}
