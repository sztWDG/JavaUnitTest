package org.lionhead.day01;

import java.util.HashMap;

public class PriceCalTester {
    private final PriceCalculator priceCalculator = new PriceCalculator();

    // 单元测试函数/方法
    public void testMethodEntry() {
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        case1Test(priceCalculator);
        case2Test(priceCalculator);
        case3Test(priceCalculator);

        pricePlusTest1(priceCalculator);
        pricePlusTest3(priceCalculator);

        ge100le150(priceCalculator);
        ge150le200(priceCalculator);
        le30(priceCalculator);

        unitTestCalTotalPricePlus(priceCalculator);

    }

    public void unitTestCalTotalPricePlus(PriceCalculator priceCalculator) {
        PriceCalculator priceCalculator1 = new PriceCalculatorDouble(90);
        ExpressServiceDouble expressServiceDouble = new ExpressServiceDouble(20,20,20);
        priceCalculator1.expressService = expressServiceDouble;
        expressServiceDouble.spy = new HashMap<>();
        assert  priceCalculator1.calTotalPricePlus(5, 85, null) == 110 && expressServiceDouble.spy.get("queryExpressPrice") == 1;
    }


    public void pricePlusTest1(PriceCalculator priceCalculator) {
        assert priceCalculator.calTotalPricePlus(10, 20, null) == 50;
    }
    public void pricePlusTest3(PriceCalculator priceCalculator) {
        assert priceCalculator.calTotalPricePlus(50, 60, null) == 120;
    }


    public void le30(PriceCalculator priceCalculator) {
        assert priceCalculator.calTotalPricePlus(5,10, null) == 40;
    }
    public void ge100le150(PriceCalculator priceCalculator) {
        assert priceCalculator.calTotalPricePlus(80,30, null) == 120;
    }
    public void ge150le200(PriceCalculator priceCalculator) {
        assert priceCalculator.calTotalPricePlus(100, 70, null) == 175;
    }


    public void case1Test(PriceCalculator priceCalculator){
        assert priceCalculator.calPriceSum(1,2) == 3;
    }
    public void case2Test(PriceCalculator priceCalculator){
        assert priceCalculator.calPriceSum(2,5) == 7;
    }
    public void case3Test(PriceCalculator priceCalculator){
        assert priceCalculator.calPriceSum(-1, 5) == 4;
    }
}
