package com.rootdome.generator.service;

import com.rootdome.generator.entity.Camerainputequipment;
import com.baomidou.mybatisplus.service.IService;
import com.rootdome.generator.entity.CamerainputequipmentVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
public interface CamerainputequipmentService extends IService<Camerainputequipment> {

    public List<CamerainputequipmentVo> selectD();
}
