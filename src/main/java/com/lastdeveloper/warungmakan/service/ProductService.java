/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lastdeveloper.warungmakan.service;

import com.lastdeveloper.warungmakan.entity.ProductEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Last
 */
public interface ProductService {
    List<ProductEntity> findAllProduct();
    Optional<ProductEntity> findById(Long id);
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity productEntity);
    void deleteProduct(Long id);
}
