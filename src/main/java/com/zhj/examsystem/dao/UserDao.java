package com.zhj.examsystem.dao;

import com.zhj.examsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    @Select("SELECT * FROM user WHERE id=#{id}")
    @Results({
            @Result(property = "userName", column = "user_name")
    })
    User getUserById(int id);

    //@Select("SELECT * from user WHERE user_name=#{} and password=#{}")
    User getUserLogin(String userName,String password);
}
