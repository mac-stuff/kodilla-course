package com.kodilla.good.patterns.challenge3;

public class SaleRequest {

    private final User user;
    private final String product;

    public  SaleRequest(User user, String product) {
        this.user = user;
        this.product = product;
    }

    User getUser() {
        return user;
    }

    String getProduct() {
        return product;
    }
}
