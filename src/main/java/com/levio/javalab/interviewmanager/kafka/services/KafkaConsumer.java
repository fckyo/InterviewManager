package com.levio.javalab.interviewmanager.kafka.services;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer<T> {

    @KafkaListener(topics = "${kafka.consumer.user.topic}", groupId = "${kafka.consumer.user.group}")
    public void consume(ConsumerRecord<String, T> record) {
        System.out.println("**********");
        System.out.println(record.value().toString());
        System.out.println("**********");
    }
}
