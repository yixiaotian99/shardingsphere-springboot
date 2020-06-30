package com.xiao.sp.db.table.controller;

import cn.hutool.core.util.RandomUtil;
import com.xiao.sp.db.table.dao.CompanyMapper;
import com.xiao.sp.db.table.entity.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author sunjinwei
 * @Date 2020-06-30 21:13
 * @Description TODO
 **/
@SpringBootTest
class CompanyControllerTest {


    @Autowired
    private CompanyMapper companyMapper;


    @Test
    void insert() {

        for (int i = 0; i < 10; i++) {

            Company company = new Company();
            company.setName("新增加企业-" + i);
            company.setProvinceId(RandomUtil.randomInt(0, 11));
            company.setUserId(1L);

            companyMapper.insert(company);
        }

    }


    @Test
    void select() {
    }
}