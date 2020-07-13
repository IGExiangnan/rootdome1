package com.rootdome.generator.service.impl;

import com.rootdome.generator.entity.Wifiinputequipment;
import com.rootdome.generator.entity.WifiinputequipmentVo;
import com.rootdome.generator.mapper.WifiinputequipmentMapper;
import com.rootdome.generator.service.WifiinputequipmentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
@Service
public class WifiinputequipmentServiceImpl extends ServiceImpl<WifiinputequipmentMapper, Wifiinputequipment> implements WifiinputequipmentService {

    @Autowired
    WifiinputequipmentMapper mapper;

    @Override
    public List<Wifiinputequipment> selectAll() {
        return mapper.selectList(null);
    }

    @Override
    public List<WifiinputequipmentVo> selectD() {
        return mapper.selectD();
    }

    @Override
    public Wifiinputequipment selectByName(String name) {
        return mapper.selectById(name);
    }

    @Override
    public String add(Wifiinputequipment we) {
        if (mapper.insert(we)>0) return "新增成功";
        else return "新增失败";

    }

    @Override
    public String delete(String name) {
        if (mapper.deleteById(name)>0) return "删除成功";
        else return "删除失败";

    }

    @Override
    public String update(Wifiinputequipment we) {
        if (mapper.updateById(we)>0) return "修改成功";
        else return "修改失败";
    }

}
