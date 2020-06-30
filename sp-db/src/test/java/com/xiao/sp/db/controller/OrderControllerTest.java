package com.xiao.sp.db.controller;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiao.sp.db.dao.OrderMapper;
import com.xiao.sp.db.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-30 20:58
 * @Description TODO
 **/
@SpringBootTest
class OrderControllerTest {


    @Autowired
    private OrderMapper orderMapper;


    @Test
    void insert() {

        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setName("新订单-" + i);
            order.setCompanyId(Long.valueOf(i));

            orderMapper.insert(order);
        }

    }


    @Test
    void select() {

        QueryWrapper<Order>  wrapper = new QueryWrapper<>();
        wrapper.eq("id", 484830259812761601L);

        List<Order> orders = orderMapper.selectList(wrapper);
        System.out.println(JSONUtil.toJsonStr(orders));

    }
}