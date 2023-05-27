package com.example.sales.domain.repository;

import com.example.sales.domain.models.Cart;
import com.example.sales.domain.models.CartId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, CartId> {

}
