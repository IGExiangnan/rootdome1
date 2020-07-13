package com.rootdome.generator.service.impl;

import com.rootdome.generator.entity.Seriaportinputequipment;
import com.rootdome.generator.entity.SeriaportinputequipmentVo;
import com.rootdome.generator.mapper.SeriaportinputequipmentMapper;
import com.rootdome.generator.service.SeriaportinputequipmentService;
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
public class SeriaportinputequipmentServiceImpl extends ServiceImpl<SeriaportinputequipmentMapper, Seriaportinputequipment> implements SeriaportinputequipmentService {

    @Autowired
    SeriaportinputequipmentMapper mapper;
    @Override
    public List<SeriaportinputequipmentVo> selectD() {
        return mapper.selectD();
    }
}
