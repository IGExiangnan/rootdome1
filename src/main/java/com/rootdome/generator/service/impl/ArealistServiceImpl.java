package com.rootdome.generator.service.impl;

import com.baomidou.mybatisplus.annotations.TableId;
import com.rootdome.generator.entity.Arealist;
import com.rootdome.generator.mapper.ArealistMapper;
import com.rootdome.generator.service.ArealistService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
@Service
public class ArealistServiceImpl extends ServiceImpl<ArealistMapper, Arealist> implements ArealistService {

    @Autowired
    ArealistMapper mapper;

    @Override
    public List<Arealist> selectAll() {
        return mapper.selectList(null);
    }

    @Override
    public Arealist selectById(int areaID) {
        return mapper.selectById(areaID);
    }

    @Override
    public int add(Arealist a) {
        return mapper.insert(a);
    }

    @Override
    public int del(int areaID) {
        return mapper.deleteById(areaID);
    }

    @Override
    public int update(Arealist a) {
        return mapper.updateById(a);
    }
}
