package com.xiao.sp.db.entity;

import java.io.Serializable;

/**
 * 水平分库订单表(Order)实体类
 *
 * @author sunjinwei
 * @since 2020-06-30 20:45:51
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -75151982431923287L;
    
    private Long id;
    /**
    * 订单名
    */
    private String name;
    /**
    * 公司id
    */
    private Long companyId;


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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

}