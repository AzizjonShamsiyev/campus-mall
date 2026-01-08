package com.campusmall.mall.service;

import com.campusmall.mall.entity.Order;
import java.util.List;

public interface OrderService {
    Order getById(Long id);
    List<Order> getAll();
    void create(Order order);
    void update(Order order);
    void delete(Long id);
}
