package com.xiao.global.table.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 全局用户表(User)实体类
 *
 * @author sunjinwei
 * @since 2020-06-30 21:36:13
 */
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = -95727752507971751L;
    
    private Long id;
    /**
    * 用户名
    */
    private String username;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}