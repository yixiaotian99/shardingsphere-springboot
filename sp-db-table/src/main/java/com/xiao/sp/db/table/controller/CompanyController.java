package com.xiao.sp.db.table.controller;

import com.xiao.sp.db.table.entity.Company;
import com.xiao.sp.db.table.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 水平分库分表公司表(Company)表控制层
 *
 * @author sunjinwei
 * @since 2020-06-30 21:08:21
 */
@RestController
@RequestMapping("company")
public class CompanyController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyService companyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Company selectOne(Long id) {
        return this.companyService.queryById(id);
    }

}