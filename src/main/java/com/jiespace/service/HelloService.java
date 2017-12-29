package com.jiespace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huangmingjie on 2017/10/7.
 */
@FeignClient("hello-service")
public interface HelloService {
    
    @RequestMapping("/hello")
    String hello();
}
