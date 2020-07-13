package com.rootdome.generator.service;

import com.rootdome.generator.entity.Arealist;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
public interface ArealistService extends IService<Arealist> {

    public List<Arealist> selectAll();
    public Arealist selectById(int areaID);
    public int add(Arealist a);
    public int del(int areaID);
    public  int update(Arealist a);
}
