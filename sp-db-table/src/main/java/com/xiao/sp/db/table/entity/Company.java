package com.xiao.sp.db.table.entity;

import java.io.Serializable;

/**
 * 水平分库分表公司表(Company)实体类
 *
 * @author sunjinwei
 * @since 2020-06-30 21:08:21
 */
public class Company implements Serializable {
    private static final long serialVersionUID = 220094260027913216L;
    
    private Long id;
    /**
    * 公司名
    */
    private String name;
    /**
    * 公司拼音全称
    */
    private Integer provinceId;
    /**
    * 用户id
    */
    private Long userId;


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

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}