package com.kodilla.good.patterns.challenge2;

public class OrderProcessor {

    private final InformationService informationService;

    public OrderProcessor(final InformationService informationService) {
        this.informationService = informationService;
    }

    public void process(final OrderRequest orderRequest, final Suppliers suppliers) {

        for (int i = 0; i < suppliers.suppliers.size(); i++) {
            if (orderRequest.getSupplier().equals(suppliers.suppliers.get(i).getName())) {
                if (suppliers.suppliers.get(i).process(orderRequest)) {
                    informationService.inform();
                } else {
                    System.out.println("We are sorry the product is not available.");
                }
            }
        }
    }
}
