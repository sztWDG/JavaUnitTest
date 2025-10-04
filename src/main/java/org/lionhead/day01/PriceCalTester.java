package org.lionhead.day01;

public class PriceCalTester {
    private PriceCaculator priceCaculator = new PriceCaculator();

    // 单元测试函数/方法
    public  boolean testMethodEntry() {
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        return case1Test(priceCaculator) && case2Test(priceCaculator) && case3Test(priceCaculator);
    }

    public  boolean case1Test(PriceCaculator priceCaculator) {
        return priceCaculator.calPriceSum(1, 2) == 3;
    }

    public  boolean case2Test(PriceCaculator priceCaculator) {
        return priceCaculator.calPriceSum(2, 5) == 7;
    }

    public  boolean case3Test(PriceCaculator priceCaculator) {
        return priceCaculator.calPriceSum(-1, 5) == 4;
    }
}
