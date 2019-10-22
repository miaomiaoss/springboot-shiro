package com.zy.config.shiro;

import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/17   17:01
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/user/login");

        HashMap<String, String> filterChainDefinitionMap = new HashMap<>(16);
        filterChainDefinitionMap.put("/user/register","anon");
        filterChainDefinitionMap.put("/user/logout","logout");

        //--------------------------
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();

        DefaultSubjectDAO defaultSubjectDAO = new DefaultSubjectDAO();

        defaultWebSecurityManager.setSubjectDAO(defaultSubjectDAO);
        defaultWebSecurityManager.setRealm(myRealm());

        return defaultWebSecurityManager;
    }

    @Bean
    public MyRealm myRealm(){
        return new MyRealm();
    }
}