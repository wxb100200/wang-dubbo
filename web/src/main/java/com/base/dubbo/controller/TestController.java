package com.base.dubbo.controller;


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
    @RequestMapping("/findUser")
    public Object findUser(){
        BasUser user = userService.selectByKey(1);
        return user;
    }
}
