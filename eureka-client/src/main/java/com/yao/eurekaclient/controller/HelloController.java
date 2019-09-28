package com.yao.eurekaclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjie_yao
 * @date 2019年9月28日17:19:34
 */
@RestController
public class HelloController {


    /**
     * 端口号
     */
    @Value("${server.port}")
    String port;

    /**
     *  返回请求的名字和对应的端口号
     * @param name
     * @return
     */
    @RequestMapping("/hi")
    public String hello(@RequestParam String name) {
        return "hi" + name + "port:" + port;
    }
}
