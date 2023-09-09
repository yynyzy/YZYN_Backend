package com.yzyn.common.Enum;

/**
 * @author yanyinuo
 */


public enum CodeStatus {
    // 接口返回公共类
    SUCCESS(200, "请求成功"),
    FAILED(400, "请求失败"),
    ERROR(500, "系统异常");

    private Integer code;
    private String msg;

    CodeStatus(Integer code, String msg) {
            this.code = code;
            this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
