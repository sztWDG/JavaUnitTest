package org.lionhead.day01;

public class MediumPriceCase extends PriceCaseHandler{
    public ExpressService expressService = new ExpressService();

    public int calAttachPrice(int total) {
        return total + expressService.queryHalfExpressPrice();
    }
}
