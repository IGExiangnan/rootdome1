package com.rootdome.generator.service;

import com.rootdome.generator.entity.Wifiinputequipment;
import com.baomidou.mybatisplus.service.IService;
import com.rootdome.generator.entity.WifiinputequipmentVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
public interface WifiinputequipmentService extends IService<Wifiinputequipment> {
    public List<Wifiinputequipment> selectAll();
    public List<WifiinputequipmentVo> selectD();
    public  Wifiinputequipment selectByName(String name);
    public String add(Wifiinputequipment we);
    public String delete(String name);
    public String update(Wifiinputequipment we);

}
