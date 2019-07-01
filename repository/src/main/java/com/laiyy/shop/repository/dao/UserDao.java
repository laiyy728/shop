package com.laiyy.shop.repository.dao;

import com.laiyy.shop.model.entity.User;

/**
 * @author laiyy
 * @date 2019/7/1 11:32
 * description：
 */
public interface UserDao {

    /**
     * 添加用戶
     *
     * @param user 待添加的用户信息
     */
    void insertUser(User user);

    /**
     * 根据用户id，获取用户数据
     *
     * @param id 用户id
     * @return 用户数据
     */
    User getUserById(int id);

    /**
     * 根据用户 uid，查询用户数据
     *
     * @param uid 用户uid
     * @return 用户数据
     */
    User getUserByUid(String uid);

    /**
     * 修改用户状态
     *
     * @param id     用户id
     * @param status 用户状态
     */
    void updateUserStatus(int id, int status);

}
