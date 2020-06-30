package com.xiao.sp.db.table;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiao.sp.db.table.dao")
public class SpDbTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpDbTableApplication.class, args);
    }

}
