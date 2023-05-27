package com.example.sales.services.impl;

import com.example.sales.domain.models.Cart;
import com.example.sales.domain.models.CartId;
import com.example.sales.domain.models.ProductId;
import com.example.sales.domain.repository.CartRepository;
import com.example.sales.services.CartService;
import com.example.sales.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final ProductService productService;

    @Override
    public Cart findById(CartId id) {
        return this.cartRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cart> getAll() {
        return this.cartRepository.findAll();
    }

    @Override
    public Cart createCart(Cart cart) {
        return this.cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return this.cartRepository.save(cart);
    }

    @Override
    public boolean deleteCart(CartId id) {
        return this.cartRepository.findById(id)
                .map(cart -> {
                    this.cartRepository.delete(cart);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean addProductToCart(CartId cartId, ProductId productId) {
        return this.cartRepository.findById(cartId)
                .map(cart -> {
                    cart.getProducts().add(this.productService.findById(productId));
                    this.cartRepository.save(cart);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean removeProductFromCart(CartId cartId, ProductId productId) {
        return this.cartRepository.findById(cartId)
                .map(cart -> {
                    cart.getProducts().remove(this.productService.findById(productId));
                    this.cartRepository.save(cart);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean removeAllFromCart(CartId cartId) {
        return this.cartRepository.findById(cartId)
                .map(cart -> {
                    cart.getProducts().clear();
                    this.cartRepository.save(cart);
                    return true;
                })
                .orElse(false);
    }
}
