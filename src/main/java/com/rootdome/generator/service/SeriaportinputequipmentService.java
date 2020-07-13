package com.rootdome.generator.service;

import com.rootdome.generator.entity.Seriaportinputequipment;
import com.baomidou.mybatisplus.service.IService;
import com.rootdome.generator.entity.SeriaportinputequipmentVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
public interface SeriaportinputequipmentService extends IService<Seriaportinputequipment> {

    public List<SeriaportinputequipmentVo> selectD();
}
