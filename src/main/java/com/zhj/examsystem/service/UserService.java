package com.zhj.examsystem.service;

import com.zhj.examsystem.entity.User;

public interface UserService {
    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     */
    boolean userLogin(String userName, String password);

    /**
     * 新增用户
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 修改用户信息
     * @param userId
     * @param user
     * @return
     */
    boolean editUser(String userId,User user);
}
