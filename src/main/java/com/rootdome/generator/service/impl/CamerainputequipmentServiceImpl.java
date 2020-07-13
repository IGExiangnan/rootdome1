package com.rootdome.generator.service.impl;

import com.rootdome.generator.entity.Camerainputequipment;
import com.rootdome.generator.entity.CamerainputequipmentVo;
import com.rootdome.generator.mapper.CamerainputequipmentMapper;
import com.rootdome.generator.service.CamerainputequipmentService;
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
public class CamerainputequipmentServiceImpl extends ServiceImpl<CamerainputequipmentMapper, Camerainputequipment> implements CamerainputequipmentService {


    @Autowired
    CamerainputequipmentMapper mapper;
    @Override
    public List<CamerainputequipmentVo> selectD() {
        return mapper.selectD();
    }
}
