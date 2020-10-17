package com.kodilla.good.patterns.challenge3;

public class SoldRequestRetriever {

    public SaleRequest retrieve() {
        User user1 = new User("Mark", "Taylor");
        String product1 = "car";

        return new SaleRequest(user1, product1);
    }
}
