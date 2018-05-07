package com.base.dubbo.service.impl;

import com.base.dubbo.common.PageReturn;
import com.base.dubbo.common.Paginator;
import com.base.dubbo.mapper.BasUserMapper;
import com.base.dubbo.model.BasUser;
import com.base.dubbo.service.UserService;
import com.github.pagehelper.PageHelper;
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

    @Override
    public Object pageHelper(Paginator p) {
        PageHelper.startPage(p.getPageNum(), p.getPageSize());
        PageReturn data=PageReturn.list(userMapper.selectAll());
        return data;
    }
}
