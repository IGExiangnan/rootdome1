package com.rootdome.generator.service;

import com.rootdome.generator.entity.Users;
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
public interface UsersService extends IService<Users> {
    public List<Users> selectAll();
    public  int add(Users user);
}
