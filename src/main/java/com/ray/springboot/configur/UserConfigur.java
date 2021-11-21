package com.ray.springboot.configur;

import com.ray.springboot.autoConfig.condition.ClassCondition;
import com.ray.springboot.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfigur {
    @Bean
    @Conditional(ClassCondition.class)
    public User user(){
        return new User();
    }
}
