package com.campusmall.mall.controller;

import com.campusmall.mall.entity.Order;
import com.campusmall.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @PostMapping
    public void create(@RequestBody Order order) {
        orderService.create(order);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Order order) {
        order.setId(id);
        orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }
}
