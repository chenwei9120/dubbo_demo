package com.example.dubbo_demo.service.impl;

import com.example.dubbo_demo.model.User;
import com.example.dubbo_demo.service.UserService;

import java.lang.management.ManagementFactory;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    List<User> userList = new ArrayList<>();

    public UserServiceImpl() {
        userList.add(new User(1, "Jack", 1, Date.valueOf("1990-03-28")));
        userList.add(new User(2, "Jone", 1, Date.valueOf("1985-01-08")));
        userList.add(new User(3, "Frank", 1, Date.valueOf("1997-12-5")));
        userList.add(new User(4, "Way", 1, Date.valueOf("1980-11-20")));
    }

    @Override
    public User getUserById(Integer id) {
        if (id == null || id <= 0) {
            return null;
        }
        List<User> users = userList.stream().filter(u -> id.equals(u.getId())).collect(Collectors.toList());
        System.out.println(ManagementFactory.getRuntimeMXBean().getName());
        return users.size() > 0 ? users.get(0) : null;
    }
}
