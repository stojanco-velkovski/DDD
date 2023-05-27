package com.example.sales.domain.repository;

import com.example.sales.domain.models.Product;
import com.example.sales.domain.models.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {

}
