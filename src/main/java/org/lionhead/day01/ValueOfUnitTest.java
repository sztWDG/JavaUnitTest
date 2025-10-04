package org.lionhead.day01;

public class ValueOfUnitTest {
    // 主入口
    public static void main(String[] args) {
        PriceCalTester priceCalTester = new PriceCalTester();
        boolean testResult = priceCalTester.testMethodEntry();

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
