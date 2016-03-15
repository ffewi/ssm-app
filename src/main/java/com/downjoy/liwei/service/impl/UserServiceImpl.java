package com.downjoy.liwei.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.downjoy.liwei.dao.UserMapper;
import com.downjoy.liwei.domain.User;
import com.downjoy.liwei.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        //MySql连接不上，暂停到此
        return this.userDao.selectByPrimaryKey(userId);
        //return new User();
    }
    @Override
    public void updateUserById(User user) {
        // TODO Auto-generated method stub
        this.userDao.updateByPrimaryKey(user);
    }
    

}
