package com.example.sales.domain.models;

import com.example.sales.domain.valueobjects.Name;
import com.example.sales.domain.valueobjects.Type;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Product extends AbstractEntity<ProductId> {
    private Name productName;
    private Type type;
    @AttributeOverrides({
        @AttributeOverride(name = "amount", column = @Column(name = "price_amount"))
    })
    private Money price;
    private String stock;

    public static Product build(Name productName, Money price, Type type,String stock) {
        Product p = new Product();
        p.price = price;
        p.productName = productName;
        p.type=type;
        p.stock=stock;
        return p;
    }
}
