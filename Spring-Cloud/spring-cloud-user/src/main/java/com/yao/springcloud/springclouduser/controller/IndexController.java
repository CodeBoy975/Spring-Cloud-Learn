package com.yao.springcloud.springclouduser.controller;

import com.yao.model.ApiResult;
import com.yao.springcloud.springclouduser.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述： 测试
 *
 * @author pengjie_yao
 * @date 2019/9/2 21:58
 */
@RestController
public class IndexController {

    // 用户去调用另外一个项目的feign接口
    @Autowired
    private FeignService feignService;

    @RequestMapping("/test")
    public ApiResult<String> test() {

        ApiResult apiResult = new ApiResult();
        feignService.getUser2();
        apiResult.setMessage("成功");
        return apiResult;
    }


}
