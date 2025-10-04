package org.lionhead.day01;

public class PriceCaculator {
    /**
     * 计算价格的总和 + 快递费
     * @param priceA 价格 A
     * @param priceB 价格 B
     * @return 总和 + 快递费
     */
    public int calTotalPricePlus(int priceA, int priceB) {
        int total = calPriceSum(priceA, priceB);
        if (total < 100) {
            return total + 20;
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
