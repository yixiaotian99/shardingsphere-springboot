package com.xiao.read.write.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 读写分离、水平分表、字典表(Dict)实体类
 *
 * @author sunjinwei
 * @since 2020-06-30 21:49:37
 */
@TableName("t_dict")
public class Dict implements Serializable {
    private static final long serialVersionUID = -77323993828730395L;
    
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