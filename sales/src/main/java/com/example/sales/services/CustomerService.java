package com.example.sales.services;

import com.example.sales.domain.models.Customer;
import com.example.sales.domain.models.CustomerId;
import com.example.sales.domain.models.Product;
import com.example.sales.domain.models.ProductId;

import java.util.List;

public interface CustomerService {

    Customer findById(CustomerId id);
    List<Customer> getAll();
    Customer createCustomer(Customer Customer);
    Customer updateCustomer(Customer Customer);
    boolean deleteCustomer(CustomerId id);

}
