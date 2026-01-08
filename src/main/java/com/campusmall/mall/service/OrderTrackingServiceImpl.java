package com.campusmall.mall.service;

import com.campusmall.mall.entity.OrderTracking;
import com.campusmall.mall.mapper.OrderTrackingMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderTrackingServiceImpl implements OrderTrackingService {

    private final OrderTrackingMapper trackingMapper;

    @Autowired
    public OrderTrackingServiceImpl(OrderTrackingMapper trackingMapper) {
        this.trackingMapper = trackingMapper;
    }

    @Override
    public OrderTracking getById(Long id) {
        return trackingMapper.getById(id);
    }

    @Override
    public List<OrderTracking> getAll() {
        return trackingMapper.getAll();
    }

    @Override
    public void create(OrderTracking tracking) {
        trackingMapper.insert(tracking);
    }

    @Override
    public void update(OrderTracking tracking) {
        trackingMapper.update(tracking);
    }

    @Override
    public void delete(Long id) {
        trackingMapper.delete(id);
    }
}
