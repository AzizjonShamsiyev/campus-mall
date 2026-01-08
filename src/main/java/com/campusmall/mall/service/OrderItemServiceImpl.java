package com.campusmall.mall.service;

import com.campusmall.mall.entity.OrderItem;
import com.campusmall.mall.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemMapper orderItemMapper;

    @Autowired
    public OrderItemServiceImpl(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Override
    public OrderItem getById(Long id) {
        return orderItemMapper.getById(id);
    }

    @Override
    public List<OrderItem> getAll() {
        return orderItemMapper.getAll();
    }

    @Override
    public void create(OrderItem item) {
        orderItemMapper.insert(item);
    }

    @Override
    public void update(OrderItem item) {
        orderItemMapper.update(item);
    }

    @Override
    public void delete(Long id) {
        orderItemMapper.delete(id);
    }
}
