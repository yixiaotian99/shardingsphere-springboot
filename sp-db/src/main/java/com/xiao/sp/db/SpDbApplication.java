package com.xiao.sp.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.xiao.sp.db.dao")
public class SpDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpDbApplication.class, args);
    }

}
