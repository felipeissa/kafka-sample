package com.felipe.issa.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @KafkaListener(topics = "${topic.bora-praticar}", groupId = "group_id2")
    public void consume(String message) throws IOException {
        logger.info("Read message " +  message);
    }
}