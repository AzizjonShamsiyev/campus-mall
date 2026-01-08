package com.campusmall.mall.mapper;

import com.campusmall.mall.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    OrderItem getById(Long id);
    List<OrderItem> getAll();
    void insert(OrderItem item);
    void update(OrderItem item);
    void delete(Long id);
}
