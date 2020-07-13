package com.rootdome.generator.controller;


import com.rootdome.generator.entity.SeriaportinputequipmentVo;
import com.rootdome.generator.service.SeriaportinputequipmentService;
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
@RequestMapping("/generator/seriaportinputequipment")
@ResponseBody
public class SeriaportinputequipmentController {

    @Autowired
    SeriaportinputequipmentService seriaportinputequipmentService;
    @GetMapping("/selectD")
    public List<SeriaportinputequipmentVo> selectD(){
        return seriaportinputequipmentService.selectD();
    }
}

