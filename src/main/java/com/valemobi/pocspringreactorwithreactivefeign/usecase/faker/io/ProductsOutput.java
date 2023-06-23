package com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io;

import com.valemobi.pocspringreactorwithreactivefeign.domain.marketplace.Product;

import java.util.List;

public class ProductsOutput {

    private List<Product> products;

    public ProductsOutput(List<Product> products) {
        this.products = products;
    }

    public ProductsOutput() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
