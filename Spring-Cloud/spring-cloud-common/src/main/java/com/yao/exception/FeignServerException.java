package com.yao.exception;

/**
 * @author : Lesao
 * @version : 2018/8/23
 * @Description : feign服务调用异常
 */
public class FeignServerException extends RuntimeException{


    private static final long serialVersionUID = 1L;


    /**
     * 错误信息
     */
    private String message;

    /**
     * 异常
     */
    private Exception exception;

    public FeignServerException(){

    }
    public FeignServerException(Exception exception){
        this.exception = exception;
    }
    public FeignServerException(String message){
        this.message = message;
    }

    public FeignServerException(String message, Exception exception){
        this.message = message;
        this.exception = exception;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
