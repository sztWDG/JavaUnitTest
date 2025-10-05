package org.lionhead.day01;

import org.lionhead.day01.enums.UserLevel;

public class PriceCalculator {
    public ExpressService expressService = new ExpressService();

    // 变量作用域上移
    public UserService userService = new UserService();

    /**
     * 计算价格的总和 + 快递费
     *
     * @param priceA 价格 A
     * @param priceB 价格 B
     * @param uid
     * @return 总和 + 快递费
     */
    public int calTotalPricePlus(int priceA, int priceB, String uid) {

        // 实际上我们只需要折扣的大小，不需要知道 Level
        // UserLevel level = userService.getUserLevelBy(uid);
        int discount = userService.getUserLevelBy(uid).discount;

        int total = calPriceSum(priceA, priceB);

        if (total < 30) {
            total = total + expressService.queryExpressPrice() + expressService.queryHandFee();
        }else if (total > 150 && total < 200) {
            total = total + expressService.queryInsureExpressPrice();
        } else if (total > 100 && total < 150) {
            total = total + expressService.queryHalfExpressPrice();
        } else if (total < 100) {
            total = total + expressService.queryExpressPrice();
        } else {
            total = total;
        }

        // 做一些折扣 -> 职责内聚
//        if (level.equals("Normal")) {
//            total = total;
//        } else if (level.equals("Gold")) {
//            total = total - 10;
//        } else if (level.equals("Silver")) {
//            total = total - 5;
//        }
        total = total - discount;

        return total;
    }

    /**
     * 计算价格的总和
     *
     * @param priceA 价格 A
     * @param priceB 价格 B
     * @return 两个价格的总和
     */
    public int calPriceSum(int priceA, int priceB) {
        return priceA + priceB;
    }
}
