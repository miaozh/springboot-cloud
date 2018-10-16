package com.miao.client.controller;

import com.miao.api.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/hi")
    public User hi() {
        User user = new User();
        user.setId(1L);
        user.setName("miaozh");
        return user;
    }
}
