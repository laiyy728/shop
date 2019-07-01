package com.laiyy.shop.model.query;

import lombok.Data;

/**
 * @author laiyy
 * @date 2019/7/1 16:53
 * description：
 */
@Data
public class UserQuery {

    private int status = -1;

    private int sex = -1;

    private String name = "";

    private String phone = "";

    private int page = 1;

    private int size = 10;

    private int start = (page - 1) * size;

}
