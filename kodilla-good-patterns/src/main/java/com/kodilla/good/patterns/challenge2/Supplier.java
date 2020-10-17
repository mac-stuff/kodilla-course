package com.kodilla.good.patterns.challenge2;

public interface Supplier {

    String getName();
    boolean process(OrderRequest orderRequest);
}
