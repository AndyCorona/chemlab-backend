package com.likezhen.chemlab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.likezhen.chemlab.mapper")
public class ChemlabApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChemlabApplication.class, args);
    }

}
