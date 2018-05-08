package com.base.dubbo.controller;


import com.base.dubbo.common.MyException;
import com.base.dubbo.common.PageReturn;
import com.base.dubbo.common.Paginator;
import com.base.dubbo.model.BasTest;
import com.base.dubbo.service.TestService;
import com.base.dubbo.util.LoggerUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private Logger log =Logger.getLogger(this.getClass());
    private LoggerUtil log2=LoggerUtil.getLogger(this.getClass());
    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping("/findById")
    public Object findById(){
        BasTest test = testService.findById(1);
        return test;
    }
    @ResponseBody
    @RequestMapping("/findById2")
    public Object findById2(){
        BasTest test = testService.findById(1);
        return PageReturn.successData(test);
    }

    @ResponseBody
    @RequestMapping("/exception")
    public Object exception(){
        BasTest test = testService.selectByKey(1);
        throw new MyException("就是要抛异常");
    }
    @ResponseBody
    @RequestMapping("/pageHelper")
    public Object pageHelper(Paginator p){
        Object obj= testService.pageHelper(p);
        return  obj;
    }
    @ResponseBody
    @RequestMapping("/log4j")
    public Object log4j(){
        log.debug("---->>>>>>>>>log4j debug:");
        log.info("---->>>>>>>>>log4j info:");
        log.warn("---->>>>>>>>>log4j warn:");
        log.error("---->>>>>>>>log4j error:");
        return testService.log4j();
    }
    @ResponseBody
    @RequestMapping("/loggerUtil")
    public Object loggerUtil(){
        log2.debug("---->>>>>>>>>loggerUtil debug:");
        log2.info("---->>>>>>>>>loggerUtil info:");
        log2.warn("---->>>>>>>>>loggerUtil warn:");
        log2.error("---->>>>>>>>loggerUtil error:");
        return testService.loggerUtil();
    }
    @ResponseBody
    @RequestMapping("/register")
    public Object register(String userName,String password){
        return testService.register(userName,password);
    }

    @ResponseBody
    @RequestMapping("/constant")
    public Object constant(){
        return testService.constant();
    }

}
