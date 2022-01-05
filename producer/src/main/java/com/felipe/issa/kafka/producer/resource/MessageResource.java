package com.felipe.issa.kafka.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.felipe.issa.kafka.producer.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageResource {

    @Autowired
    MessageService messageService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
    	messageService.sendMessage(message);
        return ResponseEntity.ok().body("Message send: " + message);
    }
}