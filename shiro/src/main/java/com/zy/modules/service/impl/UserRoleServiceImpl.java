package com.zy.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.modules.pojo.entity.UserRoleEntity;
import com.zy.modules.dao.UserRoleMapper;
import com.zy.modules.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联
 * @author zy
 * @since 2019-10-16
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleEntity> implements UserRoleService {

}
