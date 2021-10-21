package com.yq.springcloud.utils;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Gyan
 * @since 2021/10/14
 */
public class ResultModel<T> implements Serializable {
    private static final long serialVersionUID = -199320501404298336L;

    /**
     * 响应码
     */
    private int code;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 响应信息
     */
    private String msg;
    /**
     * 响应时间戳
     */
    private LocalDateTime time;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "ResultModel{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", time=" + time +
                ", data=" + data +
                '}';
    }
}