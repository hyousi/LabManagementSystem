package com.iotdreamclub.demo.service;

import com.iotdreamclub.demo.entity.User;

import java.util.List;

public interface UserService {
    User login (String username , String password);
    void register (String username , String password);
    void changePersonalInfomation(String username, String password ,String userIdNumber , String userPhone , String userClassName , String userLimit);
    User selectUserByName(String username);
    User selectLimitByName(String userlimit);
    List<User> selectAll();
}
