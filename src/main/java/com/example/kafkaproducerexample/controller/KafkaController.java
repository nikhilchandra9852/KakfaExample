package com.example.kafkaproducerexample.controller;



import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    KafkaTemplate<String,String> kafkaTemplate;

    public KafkaController(KafkaTemplate<String,String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("nikhilTopic",message);
        return "Message sent";
    }


}
