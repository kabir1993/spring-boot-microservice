/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :2:58 PM
 * Project Name : orderService
 */

package com.example.orderService.dto;

public class Product {

    private String id;
    private String name;
    private double price;

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
