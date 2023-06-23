package com.valemobi.pocspringreactorwithreactivefeign.domain.marketplace;

import java.math.BigDecimal;
import java.util.List;

public class Cart {

    private Long id;
    private List<ProductCart> products;
    private BigDecimal total;
    private BigDecimal discountedTotal;
    private Long userId;
    private Integer totalProducts;
    private Integer totalQuantity;

    public Cart(Long id,
                List<ProductCart> products,
                BigDecimal total,
                BigDecimal discountedTotal,
                Long userId,
                Integer totalProducts,
                Integer totalQuantity) {
        this.id = id;
        this.products = products;
        this.total = total;
        this.discountedTotal = discountedTotal;
        this.userId = userId;
        this.totalProducts = totalProducts;
        this.totalQuantity = totalQuantity;
    }

    public Cart() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductCart> getProducts() {
        return products;
    }

    public void setProducts(List<ProductCart> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscountedTotal() {
        return discountedTotal;
    }

    public void setDiscountedTotal(BigDecimal discountedTotal) {
        this.discountedTotal = discountedTotal;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(Integer totalProducts) {
        this.totalProducts = totalProducts;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
