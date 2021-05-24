package com.zy.modules.pojo.enums;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2021/5/24   9:36
 */
public enum  RoleEnums {

    /**
     * 超级管理员
     * */
    SUPERADMIN("role.superadmin","超级管理员"),
    /**
     * 管理员
     * */
    ADMIN("role.admin","管理员");

    /**
     * code
     * */
    private String code;
    /**
     * 备注
     * */
    private String remark;

    RoleEnums(String code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }
}
