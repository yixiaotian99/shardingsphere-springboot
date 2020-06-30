package com.xiao.sp.table.entity;

import java.io.Serializable;

/**
 * 读写分离、水平分表、字典表(Dict)实体类
 *
 * @author sunjinwei
 * @since 2020-06-30 20:22:44
 */
public class Dict implements Serializable {
    private static final long serialVersionUID = 834047230156500223L;
    
    private Long id;
    /**
    * 字典名称
    */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}