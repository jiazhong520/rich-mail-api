package com.rich.mail.api.code;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Codes {
    success(200, "成功"),
    error(1, "致命异常"),
    not_login(2, "没有登陆"),
    not_auth(3, "没有权限"),
    param_error(4, "参数异常"),
    unknown_error(5, "未知异常"),
    user_error(6, "用户异常"),
    existence(7,"资源不存在"),
    user_fail(8,"注册失败"),
    user_submit(9,"重复提交"),
    not_data(10,"没有数据"),
    password_error(11,"密码错误"),
    user_login_error(12,"账号密码错误"),
    not_auth_error(13,"没有授权"),
    user_not_fount(14,"账号错误"),
    method_error(15,"请求方式错误"),
    code_error(16,"验证错误"),
    code_timeout(17,"过期"),
    new_user(18,"新用户,修改密码"),
    NOT_USER(19,"账号错误"),
    PASSWORD_ERROR(20,"密码错误"),
    PASSWORD_TIMEOUT(21,"无效的验证码"),
    CODE_ERROR(22,"验证码错误"),
    LOGIN_ERROR(23,"异地登陆"),
    SERL(25,"账号封禁"),
    ER_LOGIN(26,"该账号在别处登陆"),
    NOT_BIND(27,"请下载google authenticator 扫码登登陆"),

    ;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public String getMes() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public Codes setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {

        return "{" +
                "    \"code\": "+code+"," +
                "    \"message\": \""+message+"\"" +
                "   " +
                "}";
    }

    Codes(Integer status, String message) {
        this.code = status;
        this.message = message;
    }


    Codes(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Integer code;
    private String message;


    private Object data;

}


