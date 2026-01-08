package com.campusmall.mall.service;

import com.campusmall.mall.entity.Product;
import java.util.List;

public interface ProductService {
    Product getById(Long id);
    List<Product> getAll();
    void create(Product product);
    void update(Product product);
    void delete(Long id);
}
