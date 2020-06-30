package com.xiao.sp.table.controller;

import com.xiao.sp.table.dao.DictMapper;
import com.xiao.sp.table.entity.Dict;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author sunjinwei
 * @Date 2020-06-30 19:43
 * @Description TODO
 **/
@SpringBootTest
class DictControllerTest {


    @Autowired
    private DictMapper dictMapper;


    /**
     * 测试插入数据
     */
    @Test
    void insert() {

        for (int i = 0; i < 10; i++) {
            Dict dict = new Dict();
            dict.setName("测试的字典名称-" + i);

            dictMapper.insert(dict);
        }
    }


    @Test
    void selectOne() {

        dictMapper.queryById(1L);

        System.out.println("==========");

        dictMapper.queryById(2L);
    }
}