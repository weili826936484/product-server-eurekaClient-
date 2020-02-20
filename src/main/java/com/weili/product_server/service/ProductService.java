package com.weili.product_server.service;

import com.weili.product_server.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<Product> findAll();

    Product findById(Integer id);

    Map<String, Object> saveProduct(Product product);
}
