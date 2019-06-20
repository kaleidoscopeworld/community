package com.example.community.mapper;

import com.example.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,email,gmt_create,gmt_modified) values(#{name},#{account_id},#{token},#{email},#{gmt_create},#{gmt_modified})")
    void insert(User user);
}
