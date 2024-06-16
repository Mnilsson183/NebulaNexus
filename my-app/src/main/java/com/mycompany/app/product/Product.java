package com.mycompany.app.product;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private int upc;
    private BigDecimal cost;

    public String getProductName() {
        return productName;
    }
    public int getUpc() {
        return upc;
    }
    public BigDecimal getCost() {
        return cost;
    }
}
