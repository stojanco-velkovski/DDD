package com.example.sales.domain.repository;

import com.example.sales.domain.models.Order;
import com.example.sales.domain.models.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, OrderId> {

}
