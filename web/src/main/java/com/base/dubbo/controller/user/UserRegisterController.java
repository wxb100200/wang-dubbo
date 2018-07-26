package com.base.dubbo.controller.user;

import com.base.dubbo.service.BasUserService;
import com.base.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户注册
 */
@RestController
@RequestMapping("/user")
public class UserRegisterController {
    @Autowired
    BasUserService userService;
    /**
     * 注册
     */
    @ResponseBody
    @RequestMapping(value="/webRegister")
    public Object webRegister( String userName,  String password){
        //用户名密码不能为空

        return userService.register(userName,password);
    }
}
