package com.zy.modules.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2021/5/21   16:25
 */
@Data
public class UserDTO implements Serializable {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色代码
     */
    private String roleCode;
}
