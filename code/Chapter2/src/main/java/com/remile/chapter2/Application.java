package com.remile.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // SpringBoot引导类注解
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 启动Spring Boot服务
    }
}