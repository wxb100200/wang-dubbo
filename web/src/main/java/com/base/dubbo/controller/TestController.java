package com.base.dubbo.controller;


import com.base.dubbo.common.MyException;
import com.base.dubbo.common.PageReturn;
import com.base.dubbo.model.BasUser;
import com.base.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/findById")
    public Object findById(){
        BasUser user = userService.findById(1);
        return user;
    }
    @ResponseBody
    @RequestMapping("/findById2")
    public Object findById2(){
        BasUser user = userService.findById(1);
        return PageReturn.successData(user);
    }

    @ResponseBody
    @RequestMapping("/exception")
    public Object exception(){
        BasUser user = userService.selectByKey(1);
        throw new MyException("就是要抛异常");
    }
}
