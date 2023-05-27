package com.example.sales.domain.repository;

import com.example.sales.domain.models.Customer;
import com.example.sales.domain.models.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {

}
