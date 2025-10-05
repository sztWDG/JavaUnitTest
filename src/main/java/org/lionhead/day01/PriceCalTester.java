package org.lionhead.day01;

public class PriceCalTester {
    private final PriceCalculator priceCalculator = new PriceCalculator();

    // 单元测试函数/方法
    public  boolean testMethodEntry() {
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        boolean priceTestResult = case1Test(priceCalculator)
                && case2Test(priceCalculator)
                && case3Test(priceCalculator);
        boolean pricePlusTestResult =  pricePlusTest1(priceCalculator)
                && pricePlusTest3(priceCalculator);
        boolean newResult = ge100le150(priceCalculator)
                && ge150le200(priceCalculator)
                && le30(priceCalculator);
        boolean unitTestResult = unitTestCalTotalPricePlus(priceCalculator);

        return priceTestResult && pricePlusTestResult && newResult && unitTestResult;
    }

    public boolean unitTestCalTotalPricePlus(PriceCalculator priceCalculator) {
        PriceCalculator priceCalculator1 = new PriceCalculatorDouble(90);
        return priceCalculator1.calTotalPricePlus(5, 85) == 110;
    }


    public  boolean pricePlusTest1(PriceCalculator priceCalculator) {
        return priceCalculator.calTotalPricePlus(10, 20) == 50;
    }
    public  boolean pricePlusTest3(PriceCalculator priceCalculator) {
        return priceCalculator.calTotalPricePlus(50, 60) == 120;
    }


    public boolean le30(PriceCalculator priceCalculator) {
        return priceCalculator.calTotalPricePlus(5,10) == 40;
    }
    public boolean ge100le150(PriceCalculator priceCalculator) {
        return priceCalculator.calTotalPricePlus(80,30) == 120;
    }
    public boolean ge150le200(PriceCalculator priceCalculator) {
        return priceCalculator.calTotalPricePlus(100, 70) == 175;
    }


    private static boolean case1Test(PriceCalculator priceCalculator){
        return priceCalculator.calPriceSum(1,2) == 3;
    }
    private static boolean case2Test(PriceCalculator priceCalculator){
        return priceCalculator.calPriceSum(2,5) == 7;
    }
    private static boolean case3Test(PriceCalculator priceCalculator){
        return priceCalculator.calPriceSum(-1, 5) == 4;
    }
}
