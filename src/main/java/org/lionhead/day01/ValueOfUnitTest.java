package org.lionhead.day01;

public class ValueOfUnitTest {

    private static UserService userService = new UserService();

    // 主入口
    public static void main(String[] args) {
        // uid call chain
        String uid = "dynamic_uid";
        userService.setUidByThread(uid);

        PriceCalTester priceCalTester = new PriceCalTester();
        priceCalTester.testMethodEntry();

//        if (testResult){
//            startAllSystem();
//        } else {
//            System.out.println("WARNING!!!ERROR");
//        }

    }

    public static void startAllSystem() {
        System.out.println("Staring all system");
    }
}
