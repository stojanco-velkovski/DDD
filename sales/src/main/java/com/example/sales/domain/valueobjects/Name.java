package com.example.sales.domain.valueobjects;


import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Name implements ValueObject {
    private final String name;
    public Name(String name){
        this.name = name;
    }
    protected Name() {
        this.name = "";
    }
}