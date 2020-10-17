package com.kodilla.good.patterns.challenge3;

public class SaleProcessor {

    private final InformationService informationService;
    private final SaleService saleService;
    private final SaleRepository saleRepository;

    public SaleProcessor(final InformationService informationService,
                         final SaleService saleService, final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sale(saleRequest.getUser(), saleRequest.getProduct());

        if (isSold) {
            informationService.inform(saleRequest.getUser());
            saleRepository.createSale(saleRequest.getUser(), 
                    saleRequest.getProduct());
            return new SaleDto(saleRequest.getUser(), true);
        } else {
            return new SaleDto(saleRequest.getUser(), false);
        }
    }
}
