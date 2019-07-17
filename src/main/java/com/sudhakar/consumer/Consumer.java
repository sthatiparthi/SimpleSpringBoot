package com.sudhakar.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test1",groupId = "users_test")
    public void consumerUsers(String payload){
        System.out.println("Consumed from test1 topic Payload "+payload);
    }
}
