package com.example.sales.services.impl;


import com.example.sales.domain.models.Customer;
import com.example.sales.domain.models.CustomerId;
import com.example.sales.domain.repository.CustomerRepository;
import com.example.sales.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;

    @Override
    public Customer findById(CustomerId id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer Customer) {
        return this.customerRepository.save(Customer);
    }

    @Override
    public Customer updateCustomer(Customer Customer) {
        return this.customerRepository.save(Customer);
    }

    @Override
    public boolean deleteCustomer(CustomerId id) {
        return this.customerRepository.findById(id)
                .map(customer -> {
                    this.customerRepository.delete(customer);
                    return true;
                })
                .orElse(false);
        }
    }

