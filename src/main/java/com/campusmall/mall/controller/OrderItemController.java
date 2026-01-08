package com.campusmall.mall.controller;

import com.campusmall.mall.entity.OrderItem;
import com.campusmall.mall.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {

    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/{id}")
    public OrderItem getById(@PathVariable Long id) {
        return orderItemService.getById(id);
    }

    @GetMapping
    public List<OrderItem> getAll() {
        return orderItemService.getAll();
    }

    @PostMapping
    public void create(@RequestBody OrderItem item) {
        orderItemService.create(item);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody OrderItem item) {
        item.setId(id);
        orderItemService.update(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        orderItemService.delete(id);
    }
}
