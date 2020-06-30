package com.xiao.sp.table;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author sunjinwei
 * @Date 2020-06-30 19:42
 * @Description 启动类入口，添加 mybatis 扫描路径
 **/
@SpringBootApplication
@MapperScan("com.xiao.sp.table.dao")
public class SpTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpTableApplication.class, args);
    }

}
