package com.example.ssmdemo.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssmdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getUserList();
}
