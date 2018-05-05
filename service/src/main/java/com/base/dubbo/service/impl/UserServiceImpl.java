package com.base.dubbo.service.impl;

import com.base.dubbo.mapper.BasUserMapper;
import com.base.dubbo.model.BasUser;
import com.base.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<BasUser> implements UserService {
    @Autowired
    BasUserMapper userMapper;
    @Override
    public BasUser findById(Integer id) {
        return userMapper.findById(id);
    }
}
