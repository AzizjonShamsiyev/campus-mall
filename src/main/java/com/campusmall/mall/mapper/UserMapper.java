package com.campusmall.mall.mapper;

import com.campusmall.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();      // getAll
    User getById(Long id);    // getById
    void insert(User user);   // insert
    void update(User user);   // update
    void delete(Long id);     // delete
}
