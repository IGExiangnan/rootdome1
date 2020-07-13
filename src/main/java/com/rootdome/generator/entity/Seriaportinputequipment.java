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
public class Seriaportinputequipment extends Model<Seriaportinputequipment> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "name")
    private String name;
    private String equipmentSerialPortMark;
    private Integer baudRate;
    private String inputOrder;
    private String dataBit;
    private String checkBit;
    private String stopBit;
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
