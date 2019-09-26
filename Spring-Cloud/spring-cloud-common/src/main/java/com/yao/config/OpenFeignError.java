package com.yao.config;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OpenFeignError
 *
 * @author xuchen_zhou
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
public class OpenFeignError {
    private String message;
    private Integer code;

    public OpenFeignError(String message) {
        this.message = message;
    }
}
