/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :3:42 PM
 * Project Name : InventoryService
 */

package com.example.InventoryService.service;

import com.example.InventoryService.Entity.Inventory;
import com.example.InventoryService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory(){
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryByProductId(String productId){
        return inventoryRepository.findById(productId).orElse(null);
    }
    public Inventory updateInventory(String productId, int quantity){
        Inventory inventory =inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product Not Found"));
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }
}
