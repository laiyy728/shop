package com.laiyy.shop.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.laiyy.shop.common.constants.DateConstant;
import com.laiyy.shop.common.constants.SexConstant;
import com.laiyy.shop.model.serializer.SexSerializer;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.UUID;

/**
 * @author laiyy
 * @date 2019/6/28 16:25
 * description：
 */
@Data
public class User {

    private int id;

    /**
     * 用户 uid
     */
    private String uid = UUID.randomUUID().toString().replace("-", "");

    /**
     * 用户名（昵称）
     */
    @NotBlank(message = "用户姓名不能为空")
    private String name = "";

    /**
     * 手机号
     */
    @Pattern(regexp = "^1[3456789]\\d{9}$", message = "手机号格式错误")
    private String phone = "";

    /**
     * 性别
     */
    @JsonSerialize(using = SexSerializer.class)
    private int sex = SexConstant.OTHER;

    /**
     * 注册时间
     */
    @JsonFormat(pattern = DateConstant.YMD_HMS_FORMAT, timezone = DateConstant.TIME_ZONE)
    private Date createDate = new Date();

    /**
     * 生日
     */
    @JsonFormat(pattern = DateConstant.YMD_CHINESE_FORMAT, timezone = DateConstant.TIME_ZONE)
    private Date birthday = null;

    /**
     * 头像
     */
    private String icon = "";

    /**
     * 状态
     */
    @Pattern(regexp = "0|10|20|30|40|50", message = "用户状态错误")
    private int status;
}
