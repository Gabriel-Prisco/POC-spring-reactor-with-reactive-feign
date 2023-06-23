package com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io;

import com.valemobi.pocspringreactorwithreactivefeign.domain.marketplace.Cart;

import java.util.List;

public class CartOutput {

    private List<Cart> carts;

    public CartOutput(List<Cart> carts) {
        this.carts = carts;
    }

    public CartOutput() {
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}
