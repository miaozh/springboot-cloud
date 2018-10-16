package com.miao.customer.controller;

import com.miao.customer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.sayHello().getName();
    }
}
