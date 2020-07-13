package com.rootdome.generator.mapper;

import com.rootdome.generator.entity.Camerainputequipment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rootdome.generator.entity.CamerainputequipmentVo;
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
public interface CamerainputequipmentMapper extends BaseMapper<Camerainputequipment> {

    @Select("SELECT *\n" +
            "FROM `camerainputequipment` c,`arealist` a \n" +
            "WHERE a.`areaID` = c.`areaID`;")
    public List<CamerainputequipmentVo> selectD();
}
