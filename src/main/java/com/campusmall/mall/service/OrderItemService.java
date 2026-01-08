package com.campusmall.mall.service;

import com.campusmall.mall.entity.OrderItem;
import java.util.List;

public interface OrderItemService {
    OrderItem getById(Long id);
    List<OrderItem> getAll();
    void create(OrderItem item);
    void update(OrderItem item);
    void delete(Long id);
}
