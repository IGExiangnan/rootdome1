package com.rootdome.generator.controller;


import com.rootdome.generator.entity.CamerainputequipmentVo;
import com.rootdome.generator.service.CamerainputequipmentService;
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
@RequestMapping("/generator/camerainputequipment")
@ResponseBody
public class CamerainputequipmentController {

    @Autowired
    CamerainputequipmentService camerainputequipmentService;
    @GetMapping(value = "/selectD")
    public List<CamerainputequipmentVo> selectD(){
        return camerainputequipmentService.selectD();
    }
}

