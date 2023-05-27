package com.example.sales.services;

import com.example.sales.domain.models.Cart;
import com.example.sales.domain.models.CartId;
import com.example.sales.domain.models.ProductId;

import java.util.List;

public interface CartService {
    Cart findById(CartId id);
    List<Cart> getAll();
    Cart createCart(Cart cart);
    Cart updateCart(Cart cart);
    boolean deleteCart(CartId id);
    boolean addProductToCart(CartId cartId, ProductId productId);
    boolean removeProductFromCart(CartId cartId, ProductId productId);
    boolean removeAllFromCart(CartId cartId);
}
