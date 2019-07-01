package com.laiyy.shop.service.rpc.impl;

import com.laiyy.shop.common.dto.Result;
import com.laiyy.shop.model.entity.User;
import com.laiyy.shop.model.query.UserQuery;
import com.laiyy.shop.rpc.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author laiyy
 * @date 2019/7/1 17:02
 * description：
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public Optional<Result> addUser(User user) {
        log.info(">>>>>>>>>>>>>> 正在添加用户信息：{} <<<<<<<<<<<<<<<<<<", user);
        return Optional.empty();
    }

    @Override
    public Optional<Result> updateUserStatus(int id, int status) {
        log.info(">>>>>>>>>>>>>>>>> 正在修改用户状态，用户id：{}， 状态：{} <<<<<<<<<<<<<<<<<<", id, status);
        return Optional.empty();
    }

    @Override
    public Optional<Result> deleteUser(int id) {
        log.info(">>>>>>>>>>>>>>>>>>> 正在删除用户：{} <<<<<<<<<<<<<<<<<<<<<<<<<", id);
        return Optional.empty();
    }

    @Override
    public Optional<Result> updateUserInfo(User user) {
        log.info(">>>>>>>>>>>>>>>>>>>>> 正在修改用户信息：{} <<<<<<<<<<<<<<<<<<<<<<<", user);
        return Optional.empty();
    }

    @Override
    public Optional<Result> findByPage(UserQuery query) {
        log.info(">>>>>>>>>>>>>>>>>> 正在进行用户检索：{} <<<<<<<<<<<<<<<<<<<<<<<<<<", query);
        return Optional.empty();
    }
}
