package com.example.demo;

import com.example.demo.model.SysUser;
import com.example.demo.repository.UserRepository;
import javafx.application.Application;
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
        user.setUserName("aa");
        user.setUserType("bb");
        //userRepository.save(user);

        Assert.assertEquals(6, userRepository.findAll().size());
        Assert.assertNotNull(userRepository.findByUserName("admin"));
        //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com"));
        //userRepository.delete(userRepository.findByUserName("aa1"));
    }

}
