package com.jiespace.controller;

import com.jiespace.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangmingjie on 2017/10/7.
 */
@RestController
public class ConsumerController {
    
    @Autowired
    private HelloService helloService;
    
    @GetMapping("/fegin")
    public String helloConsumer(){
        return helloService.hello();
    }
}
