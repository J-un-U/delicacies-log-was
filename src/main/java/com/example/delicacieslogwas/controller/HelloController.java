package com.example.delicacieslogwas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/test")
    public Map<String, Object> hello() {
        Map<String, Object> res = new HashMap<>();
        res.put("message", "Hello World!");
        res.put("status", 200);
        res.put("timestamp", System.currentTimeMillis());
        res.put("path", "hello");
        return res;
    }
}