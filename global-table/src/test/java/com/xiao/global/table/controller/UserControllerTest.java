package com.xiao.global.table.controller;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiao.global.table.dao.UserMapper;
import com.xiao.global.table.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author sunjinwei
 * @Date 2020-06-30 21:36
 * @Description TODO
 **/
@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    void insert() {

        for (int i = 0; i < 10; i++) {

            User user = new User();
            user.setUsername("新用户-" + i);

            userMapper.insert(user);
        }

    }


    @Test
    void selectOne() {

        QueryWrapper<User> wrapper = new QueryWrapper<>();

        wrapper.eq("id", 484839470328184833L);
        User user = userMapper.selectOne(wrapper);

        System.out.println(JSONUtil.toJsonStr(user));

    }
}