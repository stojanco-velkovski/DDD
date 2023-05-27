package com.example.sales.domain.models;

import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "shop_order")
public class Order extends AbstractEntity<OrderId> {

    @ManyToOne
    private Cart cart;
}
