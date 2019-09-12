package com.example.demo.mapper;

import com.example.demo.model.SysUser;

import java.util.List;

public interface UserMapper {

    List<SysUser> getAll();

    SysUser getOne(Long id);

    void insert(SysUser user);

    void update(SysUser user);

    void delete(Long id);

}

