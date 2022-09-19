package com.xuebin.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Value("${kafkaTopicConfig.defaultTopicName}")
    private String defaultTopicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendUserMessage(UserMessage userMessage) {
        try {
            kafkaTemplate.send(defaultTopicName, userMessage.getId(), new ObjectMapper().writeValueAsString(userMessage));
        } catch (JsonProcessingException e) {
            LOGGER.error("sendUserMessage 方法报错没， 无法将对象转换成 JSON {}", e.getMessage());
        }
    }
}
