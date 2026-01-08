package com.campusmall.mall.mapper;

import com.campusmall.mall.entity.OrderTracking;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderTrackingMapper {
    OrderTracking getById(Long id);
    List<OrderTracking> getAll();
    void insert(OrderTracking tracking);
    void update(OrderTracking tracking);
    void delete(Long id);
}
