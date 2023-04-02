package com.parvin.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "client/")
public class ConfigClientController {
    @Value("${greeting.message}")
    private String msg_greeting;

    @GetMapping(value = "/greeting")
    public ResponseEntity<String> getGreetingMessage() {
        return ResponseEntity.ok(msg_greeting);
    }

}
