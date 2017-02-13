package com.ysc.info.service.impl;

import com.ysc.info.dao.UserMapper;
import com.ysc.info.entity.User;
import com.ysc.info.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by bjyushicong on 2017/2/13.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;


    public User getUserById(String userName) {
        return this.userDao.selectByPrimaryKey(userName);
    }

}