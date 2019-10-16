package com.zy.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.modules.mapper.RolePermissionsMapper;
import com.zy.modules.pojo.entity.RolePermissionsEntity;
import com.zy.modules.service.RolePermissionsService;
import org.springframework.stereotype.Service;

/**
 * 角色权限关联
 * @author zy
 * @since 2019-10-16
 */
@Service
public class RolePermissionsServiceImpl extends ServiceImpl<RolePermissionsMapper, RolePermissionsEntity> implements RolePermissionsService {

}
