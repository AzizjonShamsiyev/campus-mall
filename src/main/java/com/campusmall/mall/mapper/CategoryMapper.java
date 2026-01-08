package com.campusmall.mall.mapper;

import com.campusmall.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    Category getById(Long id);
    List<Category> getAll();
    void insert(Category category);
    void update(Category category);
    void delete(Long id);
}
