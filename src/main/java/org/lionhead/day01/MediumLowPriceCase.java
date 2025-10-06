package org.lionhead.day01;

public class MediumLowPriceCase extends PriceCaseHandler{
    public ExpressService expressService = new ExpressService();

    public int calAttachPrice(int total) {
        return total + expressService.queryExpressPrice();
    }
}
