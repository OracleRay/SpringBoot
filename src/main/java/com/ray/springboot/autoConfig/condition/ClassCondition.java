package com.ray.springboot.autoConfig.condition;

/**
 * springboot自动配置原理：实现condition，重写maches方法，返回为true才会...
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ClassCondition implements Condition {
    @Override
    /**
     * context:可以获取属性值，获取加载器
     * metadata：可以注解属性
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return true;
    }
}
