package com.yuhaisheng.github.controller;
import com.yuhaisheng.github.service.serviceimpl.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("dd")
public class TestController {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ProjectService projectService;

    @GetMapping("/1111")
    public String getWay(){
        return projectService.getUerNameBy("1");
    }
    @GetMapping("/2222")
    public String get11y(){
        System.out.println("applicationContext = ");
        return "successfully";
    }
}
