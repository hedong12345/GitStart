package com.hd.httpdemo.pojo;

import java.io.Serializable;

/**
 * @author 11730
 * @date 2020/1/8
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID=1L;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public Response(){}

    public Response(Integer code, String msg, T data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
