package com.yuhaisheng.github.controller;

import com.yuhaisheng.github.service.serviceimpl.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("dd")
public class TestController {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ProjectService projectService;

    @Value("${server.port}")
    String port;

    @PostMapping("/1111")
    public String getWay(@RequestParam String name) {
        System.out.println("name = " + name + "port = " + port);
        return "name = " + name + "port = " + port;
    }

    @GetMapping("/2222")
    public String get11y(@RequestParam String name) {
        System.out.println("applicationContext = An");
        return "applicationContext = An";
    }

    @GetMapping("/restTest")
    public String restTest() {
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject("https://www.baidu.com/", String.class);
        System.out.println("applicationContext = ");
        return forObject;
    }
}
