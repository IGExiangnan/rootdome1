package com.rootdome.generator.mapper;

import com.rootdome.generator.entity.Outputequipment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rootdome.generator.entity.OutputequipmentVo;
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
public interface OutputequipmentMapper extends BaseMapper<Outputequipment> {

    @Select("SELECT *\n" +
            "FROM `outputequipment` o,`arealist` a \n" +
            "WHERE a.`areaID` = o.`areaID`;")
    public List<OutputequipmentVo> selectD();
}
