package com.lz.picture.exception;

import lombok.Getter;

/**
 * Project: picture
 * Package: com.lz.picture.exception
 * Author: YY
 * CreateTime: 2025-02-01  16:14
 * Description: BusinessException
 * 自定义异常
 * Version: 1.0
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
