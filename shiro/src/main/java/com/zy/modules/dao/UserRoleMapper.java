package com.zy.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.modules.pojo.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色关联
 * @author zy
 * @since 2019-10-16
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRoleEntity> {

}
