package com.yao.config;

import com.alibaba.fastjson.JSON;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import com.yao.exception.FeignServerException;
import com.yao.exception.ServiceException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Constructor;
import java.util.Map;

/**
 * @author : Lesao
 * @version : 2019/3/5
 * @Description :
 */
@Configuration
@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {


    @Override
    public Exception decode(String s, Response response) {
        try {
            if (response.body() != null) {
                String body = Util.toString(response.body().asReader());
                Map mapType = JSON.parseObject(body, Map.class);
                Object trace = mapType.get("trace");
                if (trace != null) {
                    log.error(trace.toString());
                }
                String message = mapType.get("message").toString();
                throw new HystrixBadRequestException(message);
            }
          return new ServiceException("");
        } catch (Exception e) {
            return new ServiceException(e.getMessage());
        }
    }
}
