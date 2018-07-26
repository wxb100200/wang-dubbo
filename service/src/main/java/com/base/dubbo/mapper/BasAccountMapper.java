package com.base.dubbo.mapper;

import com.base.dubbo.model.BasAccount;
import tk.mybatis.mapper.common.Mapper;

public interface BasAccountMapper extends Mapper<BasAccount> {
    /**
     * 根据用户名查找账号记录
     */
    BasAccount findByUserName(String userName);
}