package com.yao.handler;

import com.yao.enums.ApiResultCodeEnum;
import com.yao.exception.*;
import com.yao.model.ApiResult;
import com.yao.model.ApiResultCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author : pengjie
 * @version : 2019年9月26日17:04:22
 * @Description : 全局异常处理类。
 */
@ControllerAdvice
@Slf4j
public class GlobalDefaultExceptionHandler {

    /**
     * feign服务与服务之间调用异常,当前异常不做处理
     *
     * @param e
     * @throws Exception
     */
    @ExceptionHandler(FeignServerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object feignServerExceptionHandler(Exception e) throws Exception {
        ApiResult result = returnWrongWithMessage(ApiResultCodeEnum.E0000, e.getMessage());
        return result;
    }

    @ExceptionHandler({ServiceException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object serviceException(Exception e) throws Exception {
        ApiResult result = new ApiResult();
        result.setMessage(e.getMessage());
        result.setCode(ApiResultCodeEnum.E0000.getCode());
        return result;
//        return returnWrongWithMessage(ApiResultCodeEnum.E0002, e.getMessage());
    }
    /**
     * 返回自定义错误信息
     *
     * @param errorCode
     * @return
     */
    protected <T> ApiResult<T> returnWrongWithMessage(ApiResultCode errorCode, String message) {
        ApiResult result = new ApiResult(errorCode);
        if (StringUtils.isNotBlank(message)) {
            result.setMessage(message);
        }
        return result;
    }
}