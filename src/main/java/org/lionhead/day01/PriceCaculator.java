package org.lionhead.day01;

public class PriceCaculator {
    private final ExpressService expressService = new ExpressService();
    /**
     * 计算价格的总和 + 快递费
     * @param priceA 价格 A
     * @param priceB 价格 B
     * @return 总和 + 快递费
     */
    public int calTotalPricePlus(int priceA, int priceB) {

        int total = calPriceSum(priceA, priceB);

        if (total < 30) {
            return total + expressService.queryExpressPrice() + expressService.queryHandFee();
        }

        if (total > 150 && total < 200) {
            return total + expressService.queryInsureExpressPrice();
        }

        if (total > 100 && total < 150) {
            return total + expressService.queryHalfExpressPrice();
        }

        if (total < 100) {
            return total + expressService.queryExpressPrice();
        } else {
            return total;
        }
    }

    /**
     * 计算价格的总和
     * @param priceA 价格 A
     * @param priceB 价格 B
     * @return 两个价格的总和
     */
    public int calPriceSum(int priceA, int priceB) {
        return priceA + priceB;
    }
}
