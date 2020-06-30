package com.xiao.sp.db.controller;

import com.xiao.sp.db.entity.Order;
import com.xiao.sp.db.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 水平分库订单表(Order)表控制层
 *
 * @author sunjinwei
 * @since 2020-06-30 20:45:51
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Order selectOne(Long id) {
        return this.orderService.queryById(id);
    }

}