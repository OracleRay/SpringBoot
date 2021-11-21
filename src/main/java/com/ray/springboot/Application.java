package com.ray.springboot;

//import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@EnableAdminServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /*ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Object user = context.getBean("user");
        System.out.println(user);*/
        SpringApplication.run(Application.class, args);
    }

}
