package com.xiao.read.write.service;

import com.xiao.read.write.entity.Dict;
import java.util.List;

/**
 * 读写分离、水平分表、字典表(Dict)表服务接口
 *
 * @author sunjinwei
 * @since 2020-06-30 21:49:37
 */
public interface DictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dict queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dict 实例对象
     * @return 实例对象
     */
    Dict insert(Dict dict);

    /**
     * 修改数据
     *
     * @param dict 实例对象
     * @return 实例对象
     */
    Dict update(Dict dict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}