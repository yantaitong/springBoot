package com.cmbc.springbootconfig;

import com.cmbc.config.Person;
import com.cmbc.config.Person1;
import com.cmbc.config.Person2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Person1 person1;

    @Autowired
    Person2 person2;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }


    @Test
    public void helloServiceTest(){
        boolean helloService = applicationContext.containsBean("helloService");
        System.out.println(helloService);
        boolean helloService1 = applicationContext.containsBean("helloService01");
        System.out.println(helloService1);
    }

}
