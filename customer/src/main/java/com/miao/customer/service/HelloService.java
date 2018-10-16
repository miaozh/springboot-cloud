package com.miao.customer.service;

import com.miao.api.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("client")
public interface HelloService {

    @RequestMapping(value = "hello/hi", method = RequestMethod.GET)
    User sayHello();

}
