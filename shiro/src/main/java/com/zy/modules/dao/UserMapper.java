package com.zy.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.modules.pojo.dto.UserDTO;
import com.zy.modules.pojo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户
 * @author zy
 * @since 2019-10-16
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    UserDTO getRole(@Param("userName") String username);
}
