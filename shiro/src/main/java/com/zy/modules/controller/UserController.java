package com.zy.modules.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zy.common.base.Result;
import com.zy.modules.pojo.entity.UserEntity;
import com.zy.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result login(UserEntity user){

        return null;
    }


    @PostMapping("/test")
    public UserEntity test (String userName){

        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("userName",userName);

        return userService.getOne(wrapper);
    }
}
