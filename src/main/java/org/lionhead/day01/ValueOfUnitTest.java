package org.lionhead.day01;

public class ValueOfUnitTest {
    // 主入口
    public static void main(String[] args) {
        boolean testResult = PriceCalTester.sumTest();
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
}
