package com.zy.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.modules.pojo.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色
 * @author zy
 * @since 2019-10-16
 */
@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity> {

}
