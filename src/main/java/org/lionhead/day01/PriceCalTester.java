package org.lionhead.day01;

public class PriceCalTester {

    // 单元测试函数/方法
    public static boolean sumTest(){
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        boolean result = true;
        result = PriceCalTester.case1Test();
        result = PriceCalTester.case2Test();
        result = PriceCalTester.case3Test();

        return result;
    }

    public static boolean case1Test(){
        return PriceCaculator.calPriceSum(1,2) == 3;
    }

    public static boolean case2Test(){
        return PriceCaculator.calPriceSum(2,5) == 7;
    }

    public static boolean case3Test(){
        return PriceCaculator.calPriceSum(-1, 5) == 4;
    }
}
