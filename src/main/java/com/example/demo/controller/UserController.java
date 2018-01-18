package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangShiLin
 * @date
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List <UserBean> getAccounts() {
        List<UserBean> list = userServiceImpl.findAccountList();
        return list;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserBean getUserById(@PathVariable("id") String id) {
        return userServiceImpl.findAccount(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") String id, @RequestParam(value = "loginName", required = true) String loginName) {
        int t = userServiceImpl.update(id, loginName);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}