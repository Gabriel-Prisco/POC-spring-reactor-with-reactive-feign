package com.valemobi.pocspringreactorwithreactivefeign.domain.marketplace;

import java.math.BigDecimal;

public class ProductCart {
    private Long id;
    private String title;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal total;
    private BigDecimal discountPercentage;
    private BigDecimal discountedPrice;

    public ProductCart(Long id,
                       String title,
                       BigDecimal price,
                       Integer quantity,
                       BigDecimal total,
                       BigDecimal discountPercentage,
                       BigDecimal discountedPrice) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.discountPercentage = discountPercentage;
        this.discountedPrice = discountedPrice;
    }

    public ProductCart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
