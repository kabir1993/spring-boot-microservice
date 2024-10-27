/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :3:56 PM
 * Project Name : InventoryService
 */

package com.example.InventoryService.controller;

import com.example.InventoryService.Entity.Inventory;
import com.example.InventoryService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllInventory();
    }
    @GetMapping("/{productId}")
    public Inventory getInventoryByProductId(@PathVariable String productId){
        return inventoryService.getInventoryByProductId(productId);
    }
    @PutMapping("/{productId}")
    public Inventory updateInventory(@PathVariable String productId, int quantity){
        return inventoryService.updateInventory(productId, quantity);
    }
}
