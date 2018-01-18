package com.example.demo.service.impl;

import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangShiLin
 * @date
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public int add(String id, String loginName,String realName) {
        return userDao.add(id, loginName,realName);
    }

    @Override
    public int update(String id, String loginName) {
        return userDao.update(id, loginName);
    }

    @Override
    public int delete(String id) {
        return userDao.delete(id);
    }

    @Override
    public UserBean findAccount(String id) {
        return userDao.findUserBean(id);
    }

    @Override
    public List<UserBean> findAccountList() {
        return userDao.findUserList();
    }

    public static void main(String[] args) {
        String url = "D:\\\\aaa";
        System.out.println(url);
    }
}
