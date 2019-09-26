package com.yao.config;

import org.springframework.context.annotation.Configuration;

/**
 * OpenFeign异常捕获
 *
 * @author xuchen_zhou
 * @version 1.0.0
 */
@Configuration
public class ExceptionCatcherConfiguration {
    /*@Bean
    public ErrorDecoder errorDecoder() {
        return (methodKey, response) -> {
            if (response.status() == HttpStatus.BAD_REQUEST.value()) {
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    OpenFeignError openFeignError = objectMapper.readValue(response.body().asInputStream(), OpenFeignError.class);
                    return new HystrixBadRequestException(openFeignError.getMessage());
                } catch (IOException e) {
                    return e;
                }
            } else {
                return new HystrixBadRequestException("");
            }
        };
    }*/
}
