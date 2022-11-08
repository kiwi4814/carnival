package com.kiwi.starter.controller;

import org.redisson.api.RKeys;
import org.redisson.api.RedissonClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/health/check")
public class HealthCheckController {

    @Resource
    private RedissonClient redissonClient;

    @GetMapping("/status")
    public ResponseEntity<String> getHealthStatus() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @GetMapping("/redis/status")
    public ResponseEntity<String> checkRedisStatus() {
        RKeys keys = redissonClient.getKeys();
        String s = keys.randomKey();
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
