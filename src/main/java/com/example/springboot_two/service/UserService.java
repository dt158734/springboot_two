package com.example.springboot_two.service;

import com.example.springboot_two.entity.User;
import com.example.springboot_two.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }
}
