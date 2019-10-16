package com.zy.modules.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zy.common.base.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户
 * @author zy
 * @since 2019-10-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_user")
public class UserEntity extends DataEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

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


}
