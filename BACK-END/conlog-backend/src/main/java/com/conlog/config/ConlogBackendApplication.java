package com.conlog.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.conlog", annotationClass = Mapper.class)
@ComponentScan(basePackages = "com.conlog")
public class ConlogBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConlogBackendApplication.class, args);
    }

}
