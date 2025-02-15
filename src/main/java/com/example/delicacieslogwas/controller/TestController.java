package com.example.delicacieslogwas.controller;

import com.example.delicacieslogwas.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    private final TestServiceImpl testService;

    @Autowired
    public TestController(TestServiceImpl testService) {
        this.testService = testService;
    }

    @GetMapping("/test2")
    public String databaseConnectionTest() {
        testService.testXML();
        return "index";
    }
}
