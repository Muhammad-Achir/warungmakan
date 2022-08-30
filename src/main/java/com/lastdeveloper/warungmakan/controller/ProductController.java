/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lastdeveloper.warungmakan.controller;

import com.lastdeveloper.warungmakan.entity.ProductEntity;
import com.lastdeveloper.warungmakan.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Last
 */
@RestController
@RequestMapping("/product/")
public class ProductController {
    
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping
    public List<ProductEntity> findAllProduct() {
        return productService.findAllProduct();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductEntity> findProductById(
            @PathVariable("id") Long id
    ) {
        return productService.findById(id);
    }
    
    @PostMapping
    public ProductEntity saveProduct(
            @RequestBody ProductEntity productEntity
    ){
        return productService.saveProduct(productEntity);
    }
    
    @PutMapping
    public ProductEntity updateProduct(
            @RequestBody ProductEntity productEntity
    ) {
      return productService.updateProduct(productEntity);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProduct(
            @PathVariable("id") Long id
    ) {
        productService.deleteProduct(id);
    }
}
