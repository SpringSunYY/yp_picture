package com.lz.picture.common;

import com.lz.picture.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * Project: picture
 * Package: com.lz.picture.common
 * Author: YY
 * CreateTime: 2025-02-01  16:20
 * Description: BaseResponse
 * 全局返回封装类
 * Version: 1.0
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}