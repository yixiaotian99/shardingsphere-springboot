package com.xiao.sp.db.table.service.impl;

import com.xiao.sp.db.table.entity.Company;
import com.xiao.sp.db.table.dao.CompanyMapper;
import com.xiao.sp.db.table.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 水平分库分表公司表(Company)表服务实现类
 *
 * @author sunjinwei
 * @since 2020-06-30 21:08:21
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {


    @Resource
    private CompanyMapper companyMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Company queryById(Long id) {
        return this.companyMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Company> queryAllByLimit(int offset, int limit) {
        return this.companyMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param company 实例对象
     * @return 实例对象
     */
    @Override
    public Company insert(Company company) {
        this.companyMapper.insert(company);
        return company;
    }

    /**
     * 修改数据
     *
     * @param company 实例对象
     * @return 实例对象
     */
    @Override
    public Company update(Company company) {
        this.companyMapper.update(company);
        return this.queryById(company.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.companyMapper.deleteById(id) > 0;
    }
}