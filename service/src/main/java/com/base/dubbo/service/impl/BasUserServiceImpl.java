package com.base.dubbo.service.impl;

import com.base.dubbo.common.PageReturn;
import com.base.dubbo.mapper.BasAccountMapper;
import com.base.dubbo.model.BasAccount;
import com.base.dubbo.model.BasUser;
import com.base.dubbo.service.BasUserService;
import com.base.dubbo.util.MD5Util;
import com.base.dubbo.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户实现类
 */
@Service("userService")
public class BasUserServiceImpl extends BaseServiceImpl<BasUser> implements BasUserService {
    @Autowired
    BasAccountMapper accountMapper;
    /**
     * 用户注册
     */
    @Override
    public Object register(String userName, String password) {
        //判断该用户是否已经存在
        BasAccount account=accountMapper.findByUserName(userName);
        if(account!=null){
            return PageReturn.success("该用户已经被注册");
        }
        //新增账号
        String salt= RandomUtil.generateRandomChar(4);//获得随机盐
        String encryPassword= MD5Util.MD5(password+salt);//加密密码
        account=new BasAccount();
        account.setUserName(userName);
        account.setPassword(encryPassword);
        account.setSalt(salt);
        accountMapper.insert(account);
        return PageReturn.success("注册成功");
    }
}
