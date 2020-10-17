package com.kodilla.good.patterns.challenge3;

public class CarSaleRepository implements SaleRepository {

    @Override
    public void createSale(User user, String product) {
        System.out.println(user.name.toUpperCase() + " " + user.surname.toUpperCase() +
                " bought " + product.toUpperCase() + " - the event has been saved to the database.");
    }
}
