/**
 * Created by Puraby Deb
 * Date :10/27/2024
 * Time :1:03 PM
 * Project Name : productService
 */

package com.example.productService.service;

import com.example.productService.entity.Product;
import com.example.productService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(String id){
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
