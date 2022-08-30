/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lastdeveloper.warungmakan.repository;

import com.lastdeveloper.warungmakan.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Last
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    
}
