package com.yao.eurekaclient.controller.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  接受feign接口的请求
 * @author  pengjie_yao
 * @date 2019年9月28日17:43:58
 */
@RestController
public class FeignController {

    /**
     * 访问的端口号
     */
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/client/hi",method = RequestMethod.GET)
    public String HelloFeign(@RequestParam("name")String name) {
        return "这是feign请求的内部服务，name" + name + "你所访问feign接口的端口号port:" + port;
    }
}
