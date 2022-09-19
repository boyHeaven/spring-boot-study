package com.xuebin.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(value = "/api", produces = APPLICATION_JSON_UTF8_VALUE)
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping(value = "/kafka/producer-message")
    public UserMessage producerMessage(@RequestParam(value = "id") String id,
                                       @RequestParam(value = "name") String name,
                                       @RequestParam(value = "age") Integer age) {

        UserMessage userMessage = new UserMessage(id, name, age);
        kafkaProducer.sendUserMessage(userMessage);

        return userMessage;
    }

    @PostMapping(value = "/kafka/producer-message2")
    public UserMessage producerMessage(@RequestBody UserMessage userMessage) {
        kafkaProducer.sendUserMessage(userMessage);
        return userMessage;
    }
}
