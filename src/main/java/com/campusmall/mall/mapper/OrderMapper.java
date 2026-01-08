package com.campusmall.mall.mapper;

import com.campusmall.mall.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    Order getById(Long id);
    List<Order> getAll();
    void insert(Order order);
    void update(Order order);
    void delete(Long id);
}
