package com.yao.springcloud.springclouduser.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  描述： 跨服务调用User2
 * @author pengjie_yao
 * @date  2019年9月3日06:24:33
 *
 */
@FeignClient(value = "spring-cloud-user2")
public interface FeignService {


    @GetMapping("/user2")
    public String getUser2();
}
