package com.kodilla.good.patterns.challenge2;

import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private String name;
    private Map<Integer, String> products;

    public ExtraFoodShop(String name, Map<Integer, String> products) {
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
        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            if (entry.getValue().equals(orderRequest.getProduct())) {
                if (entry.getKey() >= orderRequest.getQuantity()) {
                    System.out.println(entry.getValue().toUpperCase() + " is available in " + name + ".");
                    return true;
                }
            }
        }
        return false;
    }
}
