package com.kodilla.good.patterns.challenge2;

import java.util.Map;

public class HealthyShop implements Supplier {

    protected String name;
    protected Map<Integer, String> products;

    public HealthyShop(String name, Map<Integer, String> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("The process method in " + name + " has been started");
        return false;
    }
}
