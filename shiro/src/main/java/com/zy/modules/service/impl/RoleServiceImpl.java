package com.zy.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.modules.pojo.entity.RoleEntity;
import com.zy.modules.dao.RoleMapper;
import com.zy.modules.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色
 * @author zy
 * @since 2019-10-16
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {

}
