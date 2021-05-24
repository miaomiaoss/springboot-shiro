package com.zy.modules.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zy.common.base.Result;
import com.zy.modules.pojo.dto.UserDTO;
import com.zy.modules.pojo.entity.UserEntity;
import com.zy.modules.pojo.enums.RoleEnums;
import com.zy.modules.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * @author zy
 * @since 2019-10-16
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result login(UserEntity user){
        log.info("userEntity:---{}",user);
        if (StringUtils.isEmpty(user.getPassword())
                || StringUtils.isEmpty(user.getUserName())) {

            return Result.fail("请输入账号或密码");
        }
        //从SecurityUtils里边创建一个subject
        Subject subject = SecurityUtils.getSubject();
        //在认证提交前准备token(令牌)
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        //执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        UserDTO role = userService.getRole(user.getUserName());
        String roleCode = role.getRoleCode();
        if (RoleEnums.ADMIN.getCode().equals(roleCode)) {
            return Result.success("欢迎管理员用户登陆", role);
        }
        if (RoleEnums.SUPERADMIN.getCode().equals(roleCode)) {
            return Result.success("欢迎超级管理员用户登陆", role);
        }

        return Result.fail("权限错误！");
    }


    @PostMapping("/test")
    public UserEntity test (String userName){

        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",userName);

        return userService.getOne(wrapper);
    }

    @PostMapping("/test/{userName}")
    public UserDTO test01(@PathVariable("userName") String userName) {
        return userService.getRole(userName);
    }
}
