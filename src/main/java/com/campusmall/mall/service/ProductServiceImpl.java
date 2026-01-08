package com.campusmall.mall.service;

import com.campusmall.mall.entity.Product;
import com.campusmall.mall.mapper.ProductMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Product getById(Long id) {
        return productMapper.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productMapper.getAll();
    }

    @Override
    public void create(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public void delete(Long id) {
        productMapper.delete(id);
    }
}
