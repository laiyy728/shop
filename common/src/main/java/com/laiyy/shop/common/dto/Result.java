package com.laiyy.shop.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author laiyy
 * @date 2019/7/1 16:44
 * description：
 */
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = 1683575241090551126L;

    private int code;

    private String msg;

    private Object obj;

}
