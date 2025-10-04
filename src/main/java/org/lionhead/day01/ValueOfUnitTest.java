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
        return PriceCalculator.calPriceSum(1,2) == 3;
    }

    private static boolean case2Test(){
        return PriceCalculator.calPriceSum(2,5) == 7;
    }

    private static boolean case3Test(){
        return PriceCalculator.calPriceSum(-1, 5) == 4;
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


    // 今天进行了升级
    class PriceCalculator {
        /**
         * 计算价格的总和
         * @param priceA 价格 A
         * @param priceB 价格 B
         * @return 两个价格的总和
         */
        public static int calPriceSum(int priceA, int priceB) {
            return priceA + priceB;
        }
    }
}
