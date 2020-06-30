package com.xiao.global.table;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiao.global.table.dao")
public class GlobalTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalTableApplication.class, args);
    }

}
