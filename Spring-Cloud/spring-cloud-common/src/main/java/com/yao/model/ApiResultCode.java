package com.yao.model;
/**
 * @program: API结果状态
 * @author: hgc
 * @create: 2018-07-07 12:50
 **/
public interface ApiResultCode {
    /**
     * 返回状态码
     * @return
     */
    public String getCode();

    /**
     * 返回错误信息
     * @return
     */
    public String getMessage();
}
