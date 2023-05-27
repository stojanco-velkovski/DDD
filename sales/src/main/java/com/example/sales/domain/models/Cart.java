package com.example.sales.domain.models;

import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Cart extends AbstractEntity<CartId> {
    @ManyToMany
    private List<Product> products;

    @OneToMany(mappedBy = "cart")
    private List<Order> orders;
}
