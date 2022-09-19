package com.xuebin.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic1", groupId = "test-consumer-group")
    public void obtainMessage(ConsumerRecord<String, String> consumerRecord) {

        String topic = consumerRecord.topic();
        int partition = consumerRecord.partition();
        String key = consumerRecord.key();
        String value = consumerRecord.value();
        System.out.println("topic: " + topic);
        System.out.println("partition: " + partition);
        System.out.println("key: " + key);
        System.out.println("value: " + value);

        System.out.println("------------------------------------------");
    }
}
