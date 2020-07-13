package com.rootdome.generator.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

import com.baomidou.mybatisplus.annotations.TableId;
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
public class Camerainputequipment extends Model<Camerainputequipment> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "name")
    private String name;
    private String equipmentMarkIP;
    private String account;
    private String password;
    private String state;
    private Integer areaID;
    private String standbyApplication01;
    private String standbyApplication02;
    private String standbyApplication03;
    private String standbyApplication04;


    @Override
    protected Serializable pkVal() {
        return this.name;
    }

}
