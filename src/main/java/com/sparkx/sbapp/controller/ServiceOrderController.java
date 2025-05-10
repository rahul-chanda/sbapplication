package com.sparkx.sbapp.controller;

import com.sparkx.sbapp.dto.ServiceOrderDTO;
import com.sparkx.sbapp.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/service-orders")
public class ServiceOrderController {

    @Autowired
    public ServiceOrderService serviceOrderService;

    // Create a new order
    @PostMapping
    public ResponseEntity<ServiceOrderDTO> createOrder(@RequestBody ServiceOrderDTO serviceOrder) {
        ServiceOrderDTO createdOrder = serviceOrderService.createOrder(serviceOrder);
        return ResponseEntity.ok(createdOrder);
    }

    // Get all orders
    @GetMapping
    public ResponseEntity<List<ServiceOrderDTO>> getAllOrders() {
        List<ServiceOrderDTO> orders = serviceOrderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    // Get order by ID
    @GetMapping("/{id}")
    public ResponseEntity<ServiceOrderDTO> getOrderById(@PathVariable Long id) {
        ServiceOrderDTO order = serviceOrderService.getOrderById(id);
        return ResponseEntity.ok(order);
    }
}