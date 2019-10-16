package com.zy.modules.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zy.common.base.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author zy
 * @since 2019-10-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_permissions")
public class PermissionsEntity extends DataEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 权限名称
     */
    private String perName;

    /**
     * 权限代码
     */
    private String perCode;

    /**
     * 创建者
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    private Long updateUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 删除标志（0：正常；1：删除；）
     */
    private String delFlag;


}
