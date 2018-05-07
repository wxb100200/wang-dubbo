package com.base.dubbo.service;

import com.base.dubbo.common.Paginator;
import com.base.dubbo.model.BasUser;

public interface UserService extends BaseService<BasUser>{
    BasUser findById(Integer id);
    Object pageHelper(Paginator p);
    Object log4j();
}
