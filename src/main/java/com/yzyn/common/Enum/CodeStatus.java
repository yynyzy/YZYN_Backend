package com.yzyn.common.Enum;

public enum ResponseStatus {
    /**
     *接口返回枚举定义
     */
    public enum RestCodeEnum {
        SUCCESS("200", "处理成功"),
        ERROR("500", "系统异常");

        private String code;
        private String msg;

        RestCodeEnum(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }

}
