/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :12:59 PM
 * Project Name : productService
 */

package com.example.productService.entity;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
