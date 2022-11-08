package com.kiwi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/check")
public class HealthCheckController {
    @GetMapping("/status")
    public ResponseEntity<String> getHealthStatus() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
