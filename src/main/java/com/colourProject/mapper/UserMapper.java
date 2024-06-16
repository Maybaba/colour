package com.colourProject.mapper;

import com.colourProject.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {

//    @Select("SELECT * FROM Users")
    List<User> findAll();

//    @Insert("INSERT INTO Users(username, password, email, created_at, updated_at) VALUES(#{username}, #{password}, #{email}, now(), now())")
//    @Options(useGeneratedKeys = true, keyProperty = "userId")
    void insert(User user);
}