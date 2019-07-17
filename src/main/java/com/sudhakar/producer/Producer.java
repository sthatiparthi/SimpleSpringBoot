package com.sudhakar.producer;

import com.sudhakar.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public String send(User payload,String topic){
        kafkaTemplate.send(topic,payload.getName());
        System.out.println("Produced to test1 topic Payload "+payload);
        return "SUCCESS";
    }
}
