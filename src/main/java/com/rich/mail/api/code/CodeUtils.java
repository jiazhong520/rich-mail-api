package com.rich.mail.api.code;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("响应")
public class CodeUtils implements Serializable {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @ApiModelProperty("状态码")
    private Integer code;
    @ApiModelProperty("状态消息")
    private String msg;
    @ApiModelProperty("数据")
    private Object data;

    public static CodeUtils SUCCESS() {
        return SET(Codes.success);
    }

    public static CodeUtils SUCCESS(Object data) {
        CodeUtils codeUtils = SET(Codes.success);
        codeUtils.setData(data);
        return codeUtils;
    }

    public static CodeUtils ERROR() {
        return SET(Codes.error);
    }

    public static CodeUtils Unauthorized(){
        return SET(Codes.not_auth);
    }
    public static CodeUtils EXIST(){
        return SET(Codes.existence);
    }

    public static CodeUtils NOT_FOUNT() {
        return SET(Codes.not_data);
    }
    public static CodeUtils CODE_ERROR() {
        return SET(Codes.CODE_ERROR);
    }
    public static CodeUtils PARAM_ERROR() {
        return SET(Codes.param_error);
    }
    public static CodeUtils USER_NAME_ERROR() {
        return SET(Codes.USER_NAME_ERROR);
    }

    private static CodeUtils SET(Codes codes) {
        CodeUtils codeUtils = new CodeUtils();
        codeUtils.setCode(codes.getCode());
        codeUtils.setMsg(codes.getMessage());
        return codeUtils;
    }
}
