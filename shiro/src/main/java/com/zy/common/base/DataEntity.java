package com.zy.common.base;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description //TODO 实体公共属性
 * @Author zhangyan
 * @Date 2019/10/16 15:41
 * @param: null
 * @return
**/
@Getter
@Setter
@ToString
public abstract class DataEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 删除标记（0：正常；1：删除；）
     */
    public static final String DEL_FLAG_NORMAL = "0";
    public static final String DEL_FLAG_DELETE = "1";
    /**
     * 创建者
     */
    protected Long createUserId;
    /**
     * 创建日期
     */
    protected Date createTime;
    /**
     * 更新者
     */
    protected Long updateUserId;
    /**
     * 更新日期
     */
    protected Date updateTime;
    /**
     * 备注
     */
    protected String remark;
    /**
     * 版本
     */
    protected Integer version;
    /**
     * 删除标记(0:正常;1:删除)
     */
    protected String delFlag;


    public void beforeInsert(){
        this.createTime = new Date();
        this.version = 0;
        this.delFlag = DataEntity.DEL_FLAG_NORMAL;
    }

    public void beforeUpdate(){
        this.updateTime = new Date();
    }

    public DataEntity() {
        super();
//        this.delFlag = DEL_FLAG_NORMAL;
    }
}
