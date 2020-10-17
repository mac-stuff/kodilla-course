package com.kodilla.good.patterns.challenge3;

public class CarSaleService implements SaleService {

    @Override
    public boolean sale(User user, String product) {
        System.out.println(user.name.toUpperCase() + " " + user.surname.toUpperCase() +
                " bought " + product.toUpperCase() + ".");
        return true;
    }
}
