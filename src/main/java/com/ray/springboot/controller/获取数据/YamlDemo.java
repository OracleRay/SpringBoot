package com.ray.springboot.controller.获取数据;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class YamlDemo {

    /**
     * 第一种方法：@Value
     */
    @Value("${person1.name}")
    private String name;
    @Value("${person1.age}")
    private int age;
    @Value("${address1[0]}")
    private String address;
    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;
    @RequestMapping("/yaml1")
    @Test
    public void test1(){
        System.out.println(name);        //张三
        System.out.println(age);         //18
        System.out.println(address);    //beijing
        System.out.println(msg1);       //hello \n world
        System.out.println(msg2);      //hello
                                         //world
    }

    /**
     * 第二种方法：Environment
     */
    @Autowired   //要想不警告，可以使用构造方法和setter方法进行依赖注入，或者Java自带的@Resource(name = "environment")
    //@Resource(name = "environment")
    private Environment environment;
    @RequestMapping("/yaml2")
    @Test
    public void test2(){
        System.out.println(environment.getProperty("person1.name"));        //张三
        System.out.println(environment.getProperty("address1[0]"));        //beijing
    }

    /**
     * 第三种方法：@ConfigurationProperties
     */
    @Resource(name = "person")
    private Person person;
    @RequestMapping("/yaml3")
    @Test
    public void test3(){
        System.out.println(person.getName());
        System.out.println(person.getAge());
        for (String s : person.getAddress()) {
            System.out.println(s);
        }
    }
}
