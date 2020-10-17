package com.kodilla.good.patterns.challenge2;

import java.util.*;

public class Suppliers {

    protected List<Supplier> suppliers = new ArrayList<>();

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
        System.out.println("A new supplier " + supplier.getName() + " has been added.");
    }
}
