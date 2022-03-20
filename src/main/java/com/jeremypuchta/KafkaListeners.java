package com.jeremypuchta;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "jeremypuchta",
            groupId = "groupId",
            containerFactory = "messageFactory"
    )
    void listener(Message data) {
        System.out.println("Listener received: " + data + " 🎉");
    }

}
