package com.campusmall.mall.service;

import com.campusmall.mall.entity.User;
import java.util.List;

public interface UserService {
    User getById(Long id);
    List<User> getAll();
    void create(User user);
    void update(User user);
    void delete(Long id);
    void save(User user);
}
