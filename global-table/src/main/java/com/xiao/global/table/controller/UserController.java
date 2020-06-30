package com.xiao.global.table.controller;

import com.xiao.global.table.entity.User;
import com.xiao.global.table.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 全局用户表(User)表控制层
 *
 * @author sunjinwei
 * @since 2020-06-30 21:36:13
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        return this.userService.queryById(id);
    }

}