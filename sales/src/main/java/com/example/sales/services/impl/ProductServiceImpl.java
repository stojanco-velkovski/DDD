package com.example.sales.services.impl;

import com.example.sales.domain.models.Product;
import com.example.sales.domain.models.ProductId;
import com.example.sales.domain.repository.ProductRepository;
import com.example.sales.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product findById(ProductId id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(ProductId id) {
        return this.productRepository.findById(id)
                .map(product -> {
                    this.productRepository.delete(product);
                    return true;
                })
                .orElse(false);
    }
}
