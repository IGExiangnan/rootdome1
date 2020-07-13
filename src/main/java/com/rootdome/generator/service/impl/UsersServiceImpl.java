package com.rootdome.generator.service.impl;

import com.rootdome.generator.entity.Users;
import com.rootdome.generator.mapper.UsersMapper;
import com.rootdome.generator.service.UsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Autowired
    UsersMapper mapper;
    @Override
    public List<Users> selectAll() {
        return mapper.selectList(null);
    }

    @Override
    public int add(Users user) {
        return mapper.insert(user);
    }


}
