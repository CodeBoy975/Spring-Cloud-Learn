package com.yao.springcloud.springclouduser2.controller.feign;

import com.yao.exception.FeignServerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述： 测试
 *
 * @author pengjie_yao
 * @date 2019/9/3 6:31
 */
@RestController
public class User2Controller {


    @GetMapping("/user2")
    public String getUser2(){
        throw new FeignServerException("获取user2接口的feign异常报错");
    }
}
