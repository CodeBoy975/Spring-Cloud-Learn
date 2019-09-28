package com.yao.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * clientA的feign接口
 *
 * @author pengjie_yao
 * @date 2019年9月28日17:49:29
 */
@FeignClient("clientA")
public interface HelloClient {

    /**
     * 向client发起feign请求
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/client/hi", method = RequestMethod.GET)
    String sayFeignHello(@RequestParam(value = "name") String name);

}
