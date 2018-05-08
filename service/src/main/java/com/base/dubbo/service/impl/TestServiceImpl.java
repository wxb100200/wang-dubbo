package com.base.dubbo.service.impl;

import com.base.dubbo.common.PageReturn;
import com.base.dubbo.common.Paginator;
import com.base.dubbo.constant.Global;
import com.base.dubbo.mapper.BasTestMapper;
import com.base.dubbo.model.BasTest;
import com.base.dubbo.service.TestService;
import com.base.dubbo.util.LoggerUtil;
import com.base.dubbo.util.MD5Util;
import com.base.dubbo.util.RandomUtil;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("testService")
public class TestServiceImpl extends BaseServiceImpl<BasTest> implements TestService {
    private Logger log =Logger.getLogger(this.getClass());
    private LoggerUtil log2=LoggerUtil.getLogger(this.getClass());
    @Autowired
    BasTestMapper testMapper;
    @Override
    public BasTest findById(Integer id) {
        return testMapper.findById(id);
    }

    @Override
    public Object pageHelper(Paginator p) {
        PageHelper.startPage(p.getPageNum(), p.getPageSize());
        PageReturn data=PageReturn.list(testMapper.selectAll());
        return data;
    }

    @Override
    public Object log4j() {
        log.debug("---->>>>>>>>>log4j debug:");
        log.info("---->>>>>>>>>log4j info:");
        log.warn("---->>>>>>>>>log4j warn:");
        log.error("---->>>>>>>>log4j error:");
        return PageReturn.success();
    }

    @Override
    public Object loggerUtil() {
        log2.debug("---->>>>>>>>>loggerUtil debug:");
        log2.info("---->>>>>>>>>loggerUtil info:");
        log2.warn("---->>>>>>>>>loggerUtil warn:");
        log2.error("---->>>>>>>>loggerUtil error:");
        return PageReturn.success();
    }

    @Override
    public Object register(String userName,String password) {
        String salt = RandomUtil.generateRandomUuid();
        String md5Password=MD5Util.MD5(salt+password);
        log.info("--->>>salt:"+salt);
        log.info("--->>>md5Password:"+md5Password);
        return PageReturn.success(salt,md5Password);
    }

    @Override
    public Object constant() {
        return PageReturn.success(Global.CONFIG.get("login_fail_number")+",啦啦啦");
    }
}
