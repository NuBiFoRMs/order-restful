package com.nubiform.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/api/v1/orders")
    public void getOrders() {

    }

    @GetMapping("/api/v1/orders/{id}")
    public void getOrder(@PathVariable int id) {

    }

    @PostMapping("/api/v1/orders/{id}")
    public void resistOrder(@PathVariable int id) {

    }
}
