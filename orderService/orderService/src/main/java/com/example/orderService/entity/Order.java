/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :2:18 PM
 * Project Name : orderService
 */

package com.example.orderService.entity;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private String id;

    private String productId;
    private int quantity;

    public Order() {
    }

    public Order(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
