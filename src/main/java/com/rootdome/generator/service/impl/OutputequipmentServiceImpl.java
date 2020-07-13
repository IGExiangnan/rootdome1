package com.rootdome.generator.service.impl;

import com.rootdome.generator.entity.Outputequipment;
import com.rootdome.generator.entity.OutputequipmentVo;
import com.rootdome.generator.mapper.OutputequipmentMapper;
import com.rootdome.generator.service.OutputequipmentService;
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
public class OutputequipmentServiceImpl extends ServiceImpl<OutputequipmentMapper, Outputequipment> implements OutputequipmentService {

    @Autowired
    OutputequipmentMapper mapper;

    @Override
    public List<Outputequipment> selectAll() {
        return mapper.selectList(null);
    }

    @Override
    public List<OutputequipmentVo> selectD() {
        return mapper.selectD();
    }

    @Override
    public int add(Outputequipment oe) {
        return mapper.insert(oe);
    }

    @Override
    public int del(String name) {
        return mapper.deleteById(name);
    }

    @Override
    public int update(Outputequipment oe) {
        return mapper.updateById(oe);
    }
}
