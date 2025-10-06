package org.lionhead.day01;

public class LowPriceCase extends PriceCaseHandler{
    public ExpressService expressService = new ExpressService();

    public int calAttachPrice(int total) {
        return total + expressService.queryExpressPrice() + expressService.queryHandFee();
    }
}
