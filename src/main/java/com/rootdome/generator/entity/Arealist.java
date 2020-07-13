package com.rootdome.generator.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Arealist extends Model<Arealist> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "areaID", type = IdType.AUTO)
    private Integer areaID;
    private String areaName;
    private String areaPicture;
    private String areaQuickMark;
    private String standbyApplication01;
    private String standbyApplication02;
    private String standbyApplication03;
    private String standbyApplication04;


    @Override
    protected Serializable pkVal() {
        return this.areaID;
    }


}
