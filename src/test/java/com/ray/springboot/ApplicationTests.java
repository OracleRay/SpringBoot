package com.ray.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)       //若测试类包名与Application包名相同可以不写（）里面的
class ApplicationTests {

    @Test
    void contextLoads() {
    }

}
