package com.campusmall.mall.service;

import com.campusmall.mall.entity.Category;
import java.util.List;

public interface CategoryService {
    Category getById(Long id);
    List<Category> getAll();
    void create(Category category);
    void update(Category category);
    void delete(Long id);
}
