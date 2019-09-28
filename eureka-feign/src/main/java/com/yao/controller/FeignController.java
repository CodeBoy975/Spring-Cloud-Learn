package com.yao.controller;

import com.yao.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjie_yao
 * @date 2019年9月28日17:47:53
 */
@RestController
public class FeignController {

    @Autowired
    private HelloClient client;

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String feign() {
        return client.sayFeignHello("这是feign请求");
    }
}
