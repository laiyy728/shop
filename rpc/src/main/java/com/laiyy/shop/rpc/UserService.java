package com.laiyy.shop.rpc;

import com.laiyy.shop.common.dto.Result;
import com.laiyy.shop.model.entity.User;
import com.laiyy.shop.model.query.UserQuery;

import java.util.Optional;

/**
 * @author laiyy
 * @date 2019/7/1 14:45
 * description：
 */
public interface UserService {

    /**
     * 添加用户信息
     *
     * @param user 用户信息
     * @return 添加后的用户信息
     */
    Optional<Result> addUser(User user);

    /**
     * 修改用户状态
     *
     * @param id     用户id
     * @param status 用户状态
     * @return 修改结果
     */
    Optional<Result> updateUserStatus(int id, int status);

    /**
     * 删除用户信息
     * @param id 用户ID
     * @return 删除结果
     */
    Optional<Result> deleteUser(int id);

    /**
     * 修改用户信息
     * @param user 修改后的用户信息
     * @return 修改结果
     */
    Optional<Result> updateUserInfo(User user);

    /**
     * 根据参数分页查询用户信息
     * @param query 查询参数
     * @return 查询结果
     */
    Optional<Result> findByPage(UserQuery query);
}
