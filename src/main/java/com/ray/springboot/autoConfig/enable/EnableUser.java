package com.ray.springboot.autoConfig.enable;

/**
 * 第三方jar包有@Enable注解，使用后，可以直接将bean加载进容器
 * enable底层由import实现，import有四种实现方法：
 *                              1.导入Bean
 *                              2.导入配置类（@Configuration）
 *                              3.导入@Import（ImportSelector）实现类，一般用于加载配置文件中的类  （springboot使用这种）
 *                              4.导入ImportBeanDefinationRegister实现类
 */
public @interface EnableUser {
}
