package com.example.delicacieslogwas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.delicacieslogwas.dao")
public class DelicaciesLogWasApplication {

    public static void main(String[] args) {
        SpringApplication.run(DelicaciesLogWasApplication.class, args);
    }

}
