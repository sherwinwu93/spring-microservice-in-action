package com.thoughtmechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring引导类
 * 启动和初始化应用程序
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //调用以启动整个Spring Boot服务
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }
}
