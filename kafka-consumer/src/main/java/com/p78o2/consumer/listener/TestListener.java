package com.p78o2.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/*
 * @author p78o2
 * @date 2021/5/27
 */
@Component
public class TestListener {
    @KafkaListener(topics = "test")
    public void listen(ConsumerRecord<String, String> cr) throws Exception {
        System.out.println("我是消费者:"+cr.toString());
    }
}
