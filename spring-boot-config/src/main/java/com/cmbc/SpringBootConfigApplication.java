package com.cmbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * @ImportResource(locations = "classpath:spring-config.xml")
 *  导入spring的配置文件让其生效
 */
@SpringBootApplication
//@ImportResource(locations = "classpath:spring-config.xml")
public class SpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigApplication.class, args);
    }

}
