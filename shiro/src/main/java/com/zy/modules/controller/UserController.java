package com.zy.modules.controller;


import com.zy.common.base.Result;
import com.zy.modules.pojo.entity.UserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * @author zy
 * @since 2019-10-16
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("login")
    public Result login(UserEntity user){

        return null;
    }
}
