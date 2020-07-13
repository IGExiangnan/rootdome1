package com.rootdome.generator.service;

import com.rootdome.generator.entity.Outputequipment;
import com.baomidou.mybatisplus.service.IService;
import com.rootdome.generator.entity.OutputequipmentVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
public interface OutputequipmentService extends IService<Outputequipment> {

    public List<Outputequipment> selectAll();
    public List<OutputequipmentVo> selectD();
    public int add(Outputequipment oe);
    public  int del(String name);
    public  int update(Outputequipment oe);
}
