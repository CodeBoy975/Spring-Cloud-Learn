package com.yao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Feign
 * @author  pengjie_yao
 * @date 2019年9月28日17:36:56
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.yao.client")
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

}
