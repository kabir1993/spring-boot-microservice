/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :1:07 PM
 * Project Name : productService
 */

package com.example.productService.controller;

import com.example.productService.entity.Product;
import com.example.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product addProducts(@RequestBody Product product){
        return productService.addProduct(product);
    }

}
