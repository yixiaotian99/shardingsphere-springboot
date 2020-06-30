package com.xiao.sp.db.table.dao;

import com.xiao.sp.db.table.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 水平分库分表公司表(Company)表数据库访问层
 *
 * @author sunjinwei
 * @since 2020-06-30 21:08:21
 */
public interface CompanyMapper extends BaseMapper<Company> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Company queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Company> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param company 实例对象
     * @return 对象列表
     */
    List<Company> queryAll(Company company);

    /**
     * 新增数据
     *
     * @param company 实例对象
     * @return 影响行数
     */
    int insert(Company company);

    /**
     * 修改数据
     *
     * @param company 实例对象
     * @return 影响行数
     */
    int update(Company company);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}