package com.zy.config.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zy.modules.pojo.entity.UserEntity;
import com.zy.modules.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/17   17:31
 */
@Slf4j
@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * @Description //TODO 授权器
     * @Author zhangyan
     * @Date 2019/10/17 17:38
     * @param: principalCollection
     * @return org.apache.shiro.authz.AuthorizationInfo
    **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("--------授权流程--------");
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo();
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", principal);
        UserEntity user = userService.getOne(wrapper);
        //获得该用户角色



        return null;
    }

    /**
     * @Description //TODO 认证器
     * @Author zhangyan
     * @Date 2019/10/17 17:38
     * @param: authenticationToken
     * @return org.apache.shiro.authc.AuthenticationInfo
    **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        log.info("--------登陆流程--------");
        //用户名
        System.out.println("=========================="+authenticationToken.getPrincipal());
        String userName = (String) authenticationToken.getPrincipal();
        //密码

//        String pwd = (String) authenticationToken.getCredentials();
//        String pwd = authenticationToken.getCredentials().toString();
        String pwd = new String((char[]) authenticationToken.getCredentials());
        System.out.println("------------------------" + pwd);

        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", userName);
        UserEntity user = userService.getOne(wrapper);

        if (user == null) {
            throw new AuthenticationException("该账户不存在");
        } else if (!pwd.equals(user.getPassword())) {
            throw new AuthenticationException("密码错误");
        }

        return new SimpleAuthenticationInfo(userName,pwd,getName());
    }
}
