package com.campusmall.mall.service;

import com.campusmall.mall.entity.Order;
import com.campusmall.mall.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public Order getById(Long id) {
        return orderMapper.getById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderMapper.getAll();
    }

    @Override
    public void create(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public void update(Order order) {
        orderMapper.update(order);
    }

    @Override
    public void delete(Long id) {
        orderMapper.delete(id);
    }
}
