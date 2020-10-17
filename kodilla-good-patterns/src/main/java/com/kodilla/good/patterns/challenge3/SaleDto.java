package com.kodilla.good.patterns.challenge3;

public class SaleDto {

    public User user;
    public boolean isSold;

    public SaleDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
