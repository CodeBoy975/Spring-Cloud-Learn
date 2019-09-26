package com.yao.springcloud.springclouduser;

import com.yao.springcloud.springclouduser.service.FeignService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
@ComponentScan(basePackages = {"com.yao"})
public class SpringCloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserApplication.class, args);
    }

}
