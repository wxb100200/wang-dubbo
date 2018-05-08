package com.base.dubbo.service;

import com.base.dubbo.common.Paginator;
import com.base.dubbo.model.BasTest;

public interface TestService extends BaseService<BasTest>{
    BasTest findById(Integer id);
    Object pageHelper(Paginator p);
    Object log4j();
    Object loggerUtil();
    Object register(String userName, String password);
    Object constant();
}
