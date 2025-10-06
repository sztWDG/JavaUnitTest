package org.lionhead.day01;

public class MediumHighPriceCase extends PriceCaseHandler{
    public ExpressService expressService = new ExpressService();

    public int calAttachPrice(int total) {
        return total + expressService.queryInsureExpressPrice();
    }
}
