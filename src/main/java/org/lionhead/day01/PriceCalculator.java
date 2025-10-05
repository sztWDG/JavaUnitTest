package org.lionhead.day01;

import org.lionhead.day01.enums.UserLevel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PriceCalculator {
    public ExpressService expressService = new ExpressService();

    // 变量作用域上移
    public UserService userService = new UserService();

    /**
     * 计算价格的总和 + 快递费
     *
     * @param prices 动态价格
     * @return 总和 + 快递费
     */
    public int calTotalPricePlus(int... prices) {

        // 实际上我们只需要折扣的大小，不需要知道 Level
        // UserLevel level = userService.getUserLevelBy(uid);
        UserLevel userLevelBy = userService.getUserLevelBy();

        // int total = calPriceSum(prices);
        // 此处又将下方抽出去的函数放回来了
//        int total = 0;
//        for (int price : prices) {
//            // 更多的逻辑
//            total = price + total;
//        }

        //int total = Arrays.stream(prices).reduce(0, (a, b) -> (a + b));
        int total = Arrays.stream(prices).sum();

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
        total = total - userLevelBy.discount;

        return total;
    }

    /**
     * 计算价格的总和
     *
     * @param prices 动态价格
     * @return 两个价格的总和
     */
    public int calPriceSum(int... prices) {
        int total = 0;
        for (int price : prices) {
            total = price + total;
        }
        return total;
    }
}
