package com.downjoy.liwei.service;

import com.downjoy.liwei.domain.User;

public interface IUserService {
    public User getUserById(int userId);
    
    public void  updateUserById(User user);
}
