package com.template.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: kevin-senzou
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.template.project.mapper"})
public class TemplateApplication {

    public static void main(String[] ars) {
        SpringApplication.run(TemplateApplication.class, ars);
    }
}
