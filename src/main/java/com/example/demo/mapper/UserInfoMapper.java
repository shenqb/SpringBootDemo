package com.example.demo.mapper;

import com.example.demo.model.UserInfo;

public interface UserInfoMapper {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
