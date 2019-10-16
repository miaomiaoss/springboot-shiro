package com.zy.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.modules.mapper.PermissionsMapper;
import com.zy.modules.pojo.entity.PermissionsEntity;
import com.zy.modules.service.PermissionsService;
import org.springframework.stereotype.Service;
/**
 * 权限
 * @author zy
 * @since 2019-10-16
 */
@Service
public class PermissionsServiceImpl extends ServiceImpl<PermissionsMapper, PermissionsEntity> implements PermissionsService {

}
