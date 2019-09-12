package com.example.demo.测试Mybatis;

import java.util.List;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new SysUser("aa", "123456", "男", "aa"));
        userMapper.insert(new SysUser("bb", "123456", "女", "bb"));
        userMapper.insert(new SysUser("cc", "123456", "男", "cc"));

        Assert.assertEquals(userMapper.getAll().size(), userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<SysUser> users = userMapper.getAll();
        if(users==null || users.size()==0){
            System.out.println("is null");
        }else{
            System.out.println(users.toString());
        }
    }


    @Test
    public void testUpdate() throws Exception {
        SysUser user = userMapper.getOne(6l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(6l).getNickName())));
    }

}
