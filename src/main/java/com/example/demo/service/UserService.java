package com.example.demo.service;

import com.example.demo.bean.UserBean;

import java.util.List;

/**
 * @author wangShiLin
 * @date
 */
public interface UserService {
    int add(String id, String loginName,String realName);
    int update(String id, String loginName);
    int delete(String id);
    UserBean findAccount(String id);
    List<UserBean> findAccountList();
}
