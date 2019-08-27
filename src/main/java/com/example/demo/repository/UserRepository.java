package com.example.demo.repository;

import com.example.demo.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUserName(String userName);
    List<SysUser> findByUserNameLike(String userName);
    //SysUser findByUserNameOrEmail(String username, String email);
}
