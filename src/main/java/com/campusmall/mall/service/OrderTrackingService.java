package com.campusmall.mall.service;

import com.campusmall.mall.entity.OrderTracking;
import java.util.List;

public interface OrderTrackingService {
    OrderTracking getById(Long id);
    List<OrderTracking> getAll();
    void create(OrderTracking tracking);
    void update(OrderTracking tracking);
    void delete(Long id);
}
