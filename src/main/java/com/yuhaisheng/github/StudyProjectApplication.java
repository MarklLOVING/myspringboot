package com.yuhaisheng.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyProjectApplication.class, args);
    }
}
