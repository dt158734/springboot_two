package com.example.springboot_two;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springboot_two.mapper")
@SpringBootApplication
public class SpringbootTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTwoApplication.class, args);
    }

}
