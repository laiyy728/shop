package com.laiyy.shop.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.laiyy.shop.common.constants.SexConstant;
import com.laiyy.shop.model.serializer.SexSerializer;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

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
    private String uid = "";

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate = new Date();

    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday = null;

    /**
     * 头像
     */
    private String icon = "";

    /**
     * 状态
     */
    private int status;
}
