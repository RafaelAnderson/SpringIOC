package com.rafael.springboot.di.app.springbootdi.services;

import java.util.List;

import com.rafael.springboot.di.app.springbootdi.models.Product;

public interface ProductService {
    
    List<Product> findAll();

    Product findById(Long id);
}
