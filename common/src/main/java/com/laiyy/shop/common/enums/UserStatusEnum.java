package com.laiyy.shop.common.enums;

import com.laiyy.shop.common.constants.UserStatusConstant;
import com.sun.javafx.collections.MappingChange;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author laiyy
 * @date 2019/6/28 17:12
 * description：
 */
public enum UserStatusEnum {

    // 删除
    DELETED(UserStatusConstant.DELETED, "已删除"),
    // 注销
    LOGOUT(UserStatusConstant.LOGOUT, "已注销"),
    // 禁用
    DISABLED(UserStatusConstant.DISABLED, "已禁用"),
    // 禁言
    BANNED(UserStatusConstant.BANNED, "禁言"),
    // 禁止交易
    STOP_MONEY(UserStatusConstant.STOP_MONEY, "禁止交易"),
    // 正常
    NORMAL(UserStatusConstant.NORMAL, "正常");

    private int code;

    private String msg;

    private static final Map<Integer, String> maps = new LinkedHashMap<>();

    public static Map<Integer, String> maps(){
        synchronized (maps){
            if (maps.size() == 0){
                for (UserStatusEnum status : values()) {
                    maps.put(status.code, status.msg);
                }
            }
        }
        return maps;
    }

    UserStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }}
