package com.kodilla.good.patterns.challenge2;

public class OrderRequest {

    private final String supplier;
    private final String product;
    private final int quantity;

    public OrderRequest(String supplier, String product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    String getSupplier() {
        return supplier;
    }

    String getProduct() {
        return product;
    }

    int getQuantity() {
        return quantity;
    }
}
