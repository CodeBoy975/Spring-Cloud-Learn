package com.yao.exception;

/**
 * @program: 业务异常
 * @author: hgc
 * @create: 2018-08-04 12:00
 **/
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
