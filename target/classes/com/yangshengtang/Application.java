package com.yangshengtang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableWebMvc
@EnableAutoConfiguration
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = {"com.yangshengtang.*"})
@SpringBootApplication(scanBasePackages = {"com.yangshengtang.*"})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
