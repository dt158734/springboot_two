package com.example.springboot_two.mapper;

import com.example.springboot_two.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
