package com.winter.service;

import com.winter.model.User;

import java.util.List;

/**
 * @uthor: tangjianhua
 * @ate: 2017/12/7.
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
