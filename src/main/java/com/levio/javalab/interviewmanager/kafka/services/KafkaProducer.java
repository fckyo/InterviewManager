package com.levio.javalab.interviewmanager.kafka.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private final KafkaTemplate kafkaTemplate;

    public KafkaProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }


}
