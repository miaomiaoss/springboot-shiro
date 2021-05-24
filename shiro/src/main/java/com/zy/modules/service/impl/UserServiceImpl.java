package com.zy.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.modules.pojo.dto.UserDTO;
import com.zy.modules.pojo.entity.UserEntity;
import com.zy.modules.dao.UserMapper;
import com.zy.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户
 * @author zy
 * @since 2019-10-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getRole(String userName) {
        return userMapper.getRole(userName);
    }
}
