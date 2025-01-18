package com.example.kafkaproducerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(
            topics="nikhilTopic",
            groupId = "nikhilGroup"
    )
    void listen(String data) {
        System.out.println("Received Data "+data);
    }
}
