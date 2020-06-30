package com.xiao.sp.table.controller;

import com.xiao.sp.table.entity.Dict;
import com.xiao.sp.table.service.DictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 读写分离、水平分表、字典表(Dict)表控制层
 *
 * @author sunjinwei
 * @since 2020-06-30 20:22:44
 */
@RestController
@RequestMapping("dict")
public class DictController {
    /**
     * 服务对象
     */
    @Resource
    private DictService dictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dict selectOne(Long id) {
        return this.dictService.queryById(id);
    }

}