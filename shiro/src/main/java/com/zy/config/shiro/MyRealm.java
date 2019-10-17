package com.zy.config.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/17   17:31
 */
public class MyRealm extends AuthorizingRealm {
    /**
     * @Description //TODO 授权器
     * @Author zhangyan
     * @Date 2019/10/17 17:38
     * @param: principalCollection
     * @return org.apache.shiro.authz.AuthorizationInfo
    **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
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
        return null;
    }
}
