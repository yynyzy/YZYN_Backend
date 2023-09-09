package com.yzyn.common.responseClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yanyinuo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult <T> {
    private Integer code;
    private String message;
    private T data;

    private static <T> ResponseResult<T> success() {
        return new ResponseResult<>(200, "success", null);
    };
    private static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(200, "success", data);
    };
    private static <T> ResponseResult<T> success(String message, T data) {
        return new ResponseResult<T>(200, message, data);
    };


    private static <T> ResponseResult<T> fail() {
        return new ResponseResult<>(400, "failed", null);
    };
    private static <T> ResponseResult<T> fail(T data) {
        return new ResponseResult<>(400, "failed", data);
    };
    private static <T> ResponseResult<T> fail(String message, T data) {
        return new ResponseResult<T>(400, message, data);
    };
    private static <T> ResponseResult<T> fail(Integer code, String message, T data) {
        return new ResponseResult<T>(code, message, data);
    };
}
