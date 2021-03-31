package com.rich.mail.api.utils;

import java.text.SimpleDateFormat;

public class Contract {


    /**
     * token
     */
    public static final String handleTokenName = "os";

    /**
     * 用户
     */
    public static final String user = "user_id";

    /**
     * 未删除状态
     */
    public static Integer deleteFlag = 0;

    /**
     * host 权限
     */
    public static String INTERFACE_ALL = "all";
    /**
     * host 权限
     */
    public static String INTERFACE_PART = "part";


    public static final SimpleDateFormat SDF = new SimpleDateFormat("yyMMddHHmmss");

    /**
     *  header
     */
    public static final String AUTH = "authorization";

    /**
     * admin 权限
     */
    public static final String ADMIN = "ADMIN";

    /**
     * 失败，或者无任何权限
     */
    public static final String FAIl = "fail";

    /**
     * 日志类
     */
    public static final String OPERATION = "operation";



    public static final Integer PAGE_SIZE = 20;


    public static final String ADMIN_TOKEN = "os";
}
