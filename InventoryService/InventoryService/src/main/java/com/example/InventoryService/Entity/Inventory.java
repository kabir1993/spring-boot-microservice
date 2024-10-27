/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :3:38 PM
 * Project Name : InventoryService
 */

package com.example.InventoryService.Entity;

import jakarta.persistence.*;

@Entity
public class Inventory {
    @Id
   @Column(name = "id", nullable = false)
    private String productId;
    private  int quantity;

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
