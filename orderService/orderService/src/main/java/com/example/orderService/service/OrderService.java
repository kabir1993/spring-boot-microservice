/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :3:01 PM
 * Project Name : orderService
 */

package com.example.orderService.service;

import com.example.orderService.dto.Product;
import com.example.orderService.entity.Order;
import com.example.orderService.repository.OrderRepository;
import com.example.orderService.repository.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(String id){
        return orderRepository.findById(id).orElse(null);
    }
    public Order addOrder(Order order){
        Product product = productClient.getProductByID(order.getId());
        if(product!=null){
            return orderRepository.save(order);
        }else {
            throw new RuntimeException("Product Not Found");
        }

    }
}
