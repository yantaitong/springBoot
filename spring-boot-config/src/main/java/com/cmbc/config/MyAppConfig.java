package com.cmbc.config;

import com.cmbc.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Configuration:指明当前类是一个配置类，替代原有的spring配置文件
 */
@Configuration
public class MyAppConfig {

    /**
     *     在配置文件中用<bean></bean>添加组件
     *     将方法的返回值添加到容器中，容器中这个组件的id就是方法名
     *
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloServiceImpl();
    }

    @Bean
    public HelloService helloService01(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloServiceImpl();
    }
}
