package com.base.dubbo.service;

import com.base.dubbo.model.BasUser;

/**
 * Created by YScredit on 2018/7/26.
 */
public interface BasUserService extends BaseService<BasUser>{
    /**
     * 用户注册
     */
    Object register(String userName,String password);
}
