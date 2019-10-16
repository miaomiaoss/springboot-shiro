package com.zy.modules.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zy.common.base.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 角色权限关联
 * @author zy
 * @since 2019-10-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_role_permissions")
public class RolePermissionsEntity extends DataEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 权限id
     */
    private Long perId;



}
