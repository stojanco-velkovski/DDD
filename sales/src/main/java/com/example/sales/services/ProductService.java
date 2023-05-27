package com.example.sales.services;

import com.example.sales.domain.models.Product;
import com.example.sales.domain.models.ProductId;

import java.util.List;

public interface ProductService {
    Product findById(ProductId id);
    List<Product> getAll();
    Product createProduct(Product product);
    Product updateProduct(Product product);
    boolean deleteProduct(ProductId id);
}
