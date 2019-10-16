package com.zy.modules.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zy.common.base.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 权限
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


}
