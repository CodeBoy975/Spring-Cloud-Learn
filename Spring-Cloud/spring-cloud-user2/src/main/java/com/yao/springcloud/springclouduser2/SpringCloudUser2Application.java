package com.yao.springcloud.springclouduser2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.yao"})
public class SpringCloudUser2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUser2Application.class, args);
    }

}
