/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :3:13 PM
 * Project Name : orderService
 */

package com.example.orderService.controller;

import com.example.orderService.entity.Order;
import com.example.orderService.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id){
        return orderService.getOrderById(id);
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
}
