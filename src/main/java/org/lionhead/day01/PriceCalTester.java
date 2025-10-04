package org.lionhead.day01;

public class PriceCalTester {
    private final PriceCaculator priceCaculator = new PriceCaculator();

    // 单元测试函数/方法
    public  boolean testMethodEntry() {
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        boolean priceTestResult = case1Test(priceCaculator) && case2Test(priceCaculator) && case3Test(priceCaculator);
        boolean pricePlusTestResult =  pricePlusTest1(priceCaculator) && pricePlusTest2(priceCaculator) && pricePlusTest3(priceCaculator);

        return priceTestResult && pricePlusTestResult;
    }

    public  boolean pricePlusTest1(PriceCaculator priceCaculator) {
        return priceCaculator.calTotalPricePlus(10, 20) == 50;
    }
    public  boolean pricePlusTest2(PriceCaculator priceCaculator) {
        return priceCaculator.calTotalPricePlus(2, 5) == 27;
    }
    public  boolean pricePlusTest3(PriceCaculator priceCaculator) {
        return priceCaculator.calTotalPricePlus(50, 60) == 110;
    }


    private static boolean case1Test(PriceCaculator priceCaculator){
        return priceCaculator.calPriceSum(1,2) == 3;
    }
    private static boolean case2Test(PriceCaculator priceCaculator){
        return priceCaculator.calPriceSum(2,5) == 7;
    }
    private static boolean case3Test(PriceCaculator priceCaculator){
        return priceCaculator.calPriceSum(-1, 5) == 4;
    }
}
