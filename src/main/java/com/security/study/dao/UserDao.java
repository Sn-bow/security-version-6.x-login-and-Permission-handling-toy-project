package com.security.study.dao;


import com.security.study.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user where username = #{username}")
    User findByUser(String username);

    @Insert("insert into user(email, password, username, role) values(#{email}, #{password}, #{username}, #{role})")
    int save(User user);


}
