package com.rootdome.generator.mapper;

import com.rootdome.generator.entity.Wifiinputequipment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rootdome.generator.entity.WifiinputequipmentVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
public interface WifiinputequipmentMapper extends BaseMapper<Wifiinputequipment> {
    @Select("SELECT *\n" +
            "FROM `wifiinputequipment` w,`arealist` a \n" +
            "WHERE a.`areaID` = w.`areaID`")
    public List<WifiinputequipmentVo> selectD();

}
