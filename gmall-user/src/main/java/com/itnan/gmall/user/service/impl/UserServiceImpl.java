package com.itnan.gmall.user.service.impl;

import com.itnan.gmall.user.mapper.UserMapper;
import com.itnan.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nan
 * @date 2020/10/2020/10/1821:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
