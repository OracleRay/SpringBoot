package com.ray.springboot.mybatis;

import com.ray.springboot.Application;
import com.ray.springboot.controller.mybatis.UserMapper;
import com.ray.springboot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyBatisTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }
}
