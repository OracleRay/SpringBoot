package com.ray.springboot.redis;

import com.ray.springboot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisDemo {
    @Resource(name = "redisTemplate")
    public RedisTemplate redisTemplate;
    @Test
    public void setRedis(){
        redisTemplate.boundValueOps("name").set("zhangsan");
    }
    @Test
    public void getRedis(){
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }
}
