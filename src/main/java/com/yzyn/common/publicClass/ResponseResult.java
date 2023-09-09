package com.yzyn.common.publicClass;

import com.yzyn.common.Enum.CodeStatus;
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
        return new ResponseResult<>(CodeStatus.SUCCESS.getCode(), CodeStatus.SUCCESS.getMsg(), null);
    };
    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(CodeStatus.SUCCESS.getCode(), CodeStatus.SUCCESS.getMsg(), data);
    };
    public static <T> ResponseResult<T> success(String message, T data) {
        return new ResponseResult<T>(CodeStatus.SUCCESS.getCode(), message, data);
    };


    public static <T> ResponseResult<T> fail() {
        return new ResponseResult<>(CodeStatus.FAILED.getCode(), CodeStatus.FAILED.getMsg(), null);
    };
    public static <T> ResponseResult<T> fail(T data) {
        return new ResponseResult<>(CodeStatus.FAILED.getCode(), CodeStatus.FAILED.getMsg(), data);
    };
    public static <T> ResponseResult<T> fail(String message, T data) {
        return new ResponseResult<T>(CodeStatus.FAILED.getCode(), message, data);
    };
    public static <T> ResponseResult<T> fail(Integer code, String message) {
        return new ResponseResult<T>(code, message, null);
    };
    public static <T> ResponseResult<T> fail(Integer code, String message, T data) {
        return new ResponseResult<T>(code, message, data);
    };
}
