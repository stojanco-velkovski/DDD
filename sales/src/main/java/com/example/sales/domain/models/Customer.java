package com.example.sales.domain.models;


import com.example.sales.domain.valueobjects.Name;
import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Customer extends AbstractEntity<CustomerId> {

    private Name customername;
    private int phonenumber;
    private String email;
}


