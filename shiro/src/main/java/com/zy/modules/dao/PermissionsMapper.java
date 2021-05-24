package com.zy.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.modules.pojo.entity.PermissionsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限
 * @author zy
 * @since 2019-10-16
 */
@Mapper
public interface PermissionsMapper extends BaseMapper<PermissionsEntity> {

}
