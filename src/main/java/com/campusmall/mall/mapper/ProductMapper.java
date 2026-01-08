package com.campusmall.mall.mapper;

import com.campusmall.mall.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    Product getById(Long id);
    List<Product> getAll();
    void insert(Product product);
    void update(Product product);
    void delete(Long id);
}
