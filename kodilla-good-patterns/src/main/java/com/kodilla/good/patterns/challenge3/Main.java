package com.kodilla.good.patterns.challenge3;

public class Main {

    public static void main(String[] args) {
        SaleProcessor saleProcessor = new SaleProcessor(new MailService(), new CarSaleService(), new CarSaleRepository());
        SaleDto saleDto = saleProcessor.process(new SoldRequestRetriever().retrieve());
    }
}
