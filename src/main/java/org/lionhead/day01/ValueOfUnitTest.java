package org.lionhead.day01;

public class ValueOfUnitTest {
    // 主入口
    public static void main(String[] args) {
        boolean testResult = sumTest();
        System.out.println(testResult);

        if (testResult){
            startAllSystem();
        } else {
            System.out.println("WARNING!!!ERROR");
        }

    }

    public static void startAllSystem() {
        System.out.println("Staring all system");
    }

    private static boolean case1Test(){
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        return PriceCaculator.calPriceSum(1,2) == 3;
    }

    private static boolean case2Test(){
        return PriceCaculator.calPriceSum(2,5) == 7;
    }

    private static boolean case3Test(){
        return PriceCaculator.calPriceSum(-1, 5) == 4;
    }

    // 单元测试函数/方法
    public static boolean sumTest(){
        // 条件 -> case
        // - 正常
        // 调用一个两数之和的函数，返回一个结果
        boolean result = true;
        result = case1Test();
        result = case2Test();
        result = case3Test();

        return result;
    }



}
