package com.zhj.examsystem.web;

import com.zhj.examsystem.dao.UserDao;
import com.zhj.examsystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public User getUsers() {
        return userDao.getUserById(1);
    }
}
