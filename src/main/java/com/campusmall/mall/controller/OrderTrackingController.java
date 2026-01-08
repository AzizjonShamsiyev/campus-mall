package com.campusmall.mall.controller;

import com.campusmall.mall.entity.OrderTracking;
import com.campusmall.mall.service.OrderTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-tracking")
public class OrderTrackingController {

    private final OrderTrackingService trackingService;

    @Autowired
    public OrderTrackingController(OrderTrackingService trackingService) {
        this.trackingService = trackingService;
    }

    @GetMapping("/{id}")
    public OrderTracking getById(@PathVariable Long id) {
        return trackingService.getById(id);
    }

    @GetMapping
    public List<OrderTracking> getAll() {
        return trackingService.getAll();
    }

    @PostMapping
    public void create(@RequestBody OrderTracking tracking) {
        trackingService.create(tracking);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody OrderTracking tracking) {
        tracking.setId(id);
        trackingService.update(tracking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        trackingService.delete(id);
    }
}
