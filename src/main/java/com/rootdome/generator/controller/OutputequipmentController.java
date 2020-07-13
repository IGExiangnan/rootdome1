package com.rootdome.generator.controller;


import com.rootdome.generator.entity.Outputequipment;
import com.rootdome.generator.entity.OutputequipmentVo;
import com.rootdome.generator.service.OutputequipmentService;
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
@RequestMapping("/generator/outputequipment")
@ResponseBody
public class OutputequipmentController {
    @Autowired
    OutputequipmentService outputequipmentService;
    @GetMapping("/outputequipmentSelectAll")
    public List<Outputequipment> selectAll(){
        return outputequipmentService.selectAll();
    }

    @GetMapping(value = "/selectD")
    public List<OutputequipmentVo> selectD(){
        return outputequipmentService.selectD();
    }
}

