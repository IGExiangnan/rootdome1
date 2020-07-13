package com.rootdome.generator.mapper;

import com.rootdome.generator.entity.Seriaportinputequipment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rootdome.generator.entity.SeriaportinputequipmentVo;
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
public interface SeriaportinputequipmentMapper extends BaseMapper<Seriaportinputequipment> {

    @Select("SELECT *\n" +
            "FROM `seriaportinputequipment` s,`arealist` a \n" +
            "WHERE a.`areaID` = s.`areaID`;")
    public List<SeriaportinputequipmentVo> selectD();
}
