package com.example.sales.domain.models;

import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
public class OrderItem extends AbstractEntity<OrderItemId> {

  private int id;
  private int quantity;
}
