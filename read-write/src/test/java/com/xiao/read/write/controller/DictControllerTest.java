package com.xiao.read.write.controller;

import cn.hutool.json.JSONUtil;
import com.xiao.read.write.dao.DictMapper;
import com.xiao.read.write.entity.Dict;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author sunjinwei
 * @Date 2020-06-30 21:50
 * @Description TODO
 **/
@SpringBootTest
class DictControllerTest {


    @Autowired
    private DictMapper dictMapper;


    @Test
    void insert() {

        for (int i = 0; i < 10; i++) {


            Dict dict = new Dict();
            dict.setName("读写分离测试-" + i);

            dictMapper.insert(dict);
        }

    }


    /**
     * 测试读写分离，可修改从库数据检查结构
     */
    @Test
    void selectOne() {

        Dict dict = dictMapper.selectById(484845125097226241L);

        System.out.println(JSONUtil.toJsonStr(dict));

    }
}