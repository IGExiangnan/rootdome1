package com.rootdome.generator.controller;


import com.rootdome.generator.entity.Wifiinputequipment;
import com.rootdome.generator.entity.WifiinputequipmentVo;
import com.rootdome.generator.service.WifiinputequipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
@Controller
@RequestMapping("/generator/wifiinputequipment")
@ResponseBody
public class WifiinputequipmentController {

    @Autowired
    WifiinputequipmentService wifiinputequipmentService;

    @GetMapping(value = "/selectD")
    public List<WifiinputequipmentVo> selectD(){return  wifiinputequipmentService.selectD();}


    @GetMapping(value ="/wifiinputequipmentSelectAll")
    public List<Wifiinputequipment> selectAll(){return wifiinputequipmentService.selectAll();}

    @GetMapping(value = "wifiinputequipmentSelectByName")
    public Wifiinputequipment selectByName(String name){return wifiinputequipmentService.selectByName(name);}

    @GetMapping(value = "/wifiinputequipmentAdd")
    public String add(String name,String equipmentMark,String outputPort,String type,String state,Integer areaID){
        if (name==null || equipmentMark==null || outputPort==null || type==null || state==null || areaID==null){
            return "新增失败";
        }
        Wifiinputequipment we = new Wifiinputequipment();
        we.setName(name);
        we.setEquipmentMark(equipmentMark);
        we.setOutputPort(outputPort);
        we.setType(type);
        we.setState(state);
        we.setAreaID(areaID);

        return wifiinputequipmentService.add(we);

    }
    @GetMapping(value = "/wifiinputequipmentDel")
    public  String del(String name){return  wifiinputequipmentService.delete(name); }

    @GetMapping(value = "wifiinputequipmentUpdate")
    public  String update(String name,String equipmentMark,String outputPort,String type,String state,Integer areaID){
        if (name==null || equipmentMark==null || outputPort==null || type==null || state==null || areaID==null){
            return "修改失败";
        }
        Wifiinputequipment we = new Wifiinputequipment();
        we.setName(name);
        we.setEquipmentMark(equipmentMark);
        we.setOutputPort(outputPort);
        we.setType(type);
        we.setState(state);
        we.setAreaID(areaID);

        return wifiinputequipmentService.update(we);
    }
}

