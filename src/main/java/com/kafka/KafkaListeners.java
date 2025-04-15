package com.kafka;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "starting",
            groupId = "NotificationID"
    )
    void listener(String data){
        System.out.println("Listener received: " + data + " !");
    }
}
