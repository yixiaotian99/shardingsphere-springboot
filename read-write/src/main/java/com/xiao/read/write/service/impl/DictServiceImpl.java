package com.xiao.read.write.service.impl;

import com.xiao.read.write.entity.Dict;
import com.xiao.read.write.dao.DictMapper;
import com.xiao.read.write.service.DictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 读写分离、水平分表、字典表(Dict)表服务实现类
 *
 * @author sunjinwei
 * @since 2020-06-30 21:49:37
 */
@Service("dictService")
public class DictServiceImpl implements DictService {


    @Resource
    private DictMapper dictMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dict queryById(Long id) {
        return this.dictMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dict> queryAllByLimit(int offset, int limit) {
        return this.dictMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dict 实例对象
     * @return 实例对象
     */
    @Override
    public Dict insert(Dict dict) {
        this.dictMapper.insert(dict);
        return dict;
    }

    /**
     * 修改数据
     *
     * @param dict 实例对象
     * @return 实例对象
     */
    @Override
    public Dict update(Dict dict) {
        this.dictMapper.update(dict);
        return this.queryById(dict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.dictMapper.deleteById(id) > 0;
    }
}