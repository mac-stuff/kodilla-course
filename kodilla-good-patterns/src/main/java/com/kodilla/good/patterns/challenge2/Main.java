package com.kodilla.good.patterns.challenge2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Suppliers suppliers = new Suppliers();

    public static void main(String[] args) {

        addSuppliers();
        OrderProcessor orderProcessor = new OrderProcessor(new InformationService());
        OrderRequest orderRequest1 = new OrderRequest("ExtraFoodShop", "Exogenous Ketones", 5);
        orderProcessor.process(orderRequest1, suppliers);
        OrderRequest orderRequest2 = new OrderRequest("ExtraFoodShop", "Berries", 1);
        orderProcessor.process(orderRequest2, suppliers);
    }

    public static void addSuppliers() {

        Map<Integer, String> products1 = new HashMap<>() {{
            put(3, "Berries");
            put(5, "Fish");
            put(1, "Leafy greens");
        }};
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", products1);
        suppliers.addSupplier(extraFoodShop);

        Map<Integer, String> products2 = new HashMap<>() {{
            put(13, "Nuts");
            put(7, "Olive oil");
            put(22, "Whole grains");
            put(8, "Yogurt");
        }};
        HealthyShop healthyShop = new HealthyShop("HealthyShop", products2);
        suppliers.addSupplier(healthyShop);

        Map<Integer, String> products3 = new HashMap<>() {{
            put(17, "Avocado");
            put(44, "Bell peppers");
            put(9, "Broccoli");
        }};
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", products3);
        suppliers.addSupplier(glutenFreeShop);
    }
}
