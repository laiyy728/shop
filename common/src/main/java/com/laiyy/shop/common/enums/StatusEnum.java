package com.laiyy.shop.common.enums;

/**
 * @author laiyy
 * @date 2019/6/28 16:39
 * description：
 */
public enum  StatusEnum {

    // 成功
    SUCCESS(200, "成功"),
    // 失败
    FAIL(500, "失败");

    private int code;
    private String msg;

    StatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }}
