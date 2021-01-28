package com.example.kafkaconsumer;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test1",groupId = "simpleConsumertest")
    public void onMessage(ConsumerRecord message){
        System.out.println( message.value());
    }
}
