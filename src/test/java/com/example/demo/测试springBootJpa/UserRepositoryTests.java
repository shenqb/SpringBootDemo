package com.example.demo.测试springBootJpa;

import com.example.demo.model.SysUser;
import com.example.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        SysUser user = new SysUser();
        user.setUserName("admin");
        user.setPassWord("123456");
        user.setUserSex("男");
        user.setNickName("测试");
        userRepository.save(user);

        try{
            //测试用户表条数
            Assert.assertEquals(6, userRepository.findAll().size());
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            //测试根据名称找记录
            Assert.assertNotNull(userRepository.findByUserName("admin"));
        }catch(Exception e){
            System.out.println(e);
        }
        //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com"));
        //userRepository.delete(userRepository.findByUserName("aa1"));
    }

}
