package com.rootdome.generator.entity;

import lombok.Data;

@Data
public class SeriaportinputequipmentVo {
    private String name;
    private String equipmentSerialPortMark;
    private Integer baudRate;
    private String inputOrder;
    private String dataBit;
    private String checkBit;
    private String stopBit;
    private String state;
    private Integer areaID;
    private String areaName;
}
