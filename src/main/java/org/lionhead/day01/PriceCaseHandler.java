package org.lionhead.day01;

public abstract class PriceCaseHandler {

    abstract public int calAttachPrice(int total);

    public static PriceCaseHandler buildPriceCaseBy(int total) {
        // 提炼函数：通过函数名称，清晰展示代码作用
        if (total < 30) {
            return new LowPriceCase();
        }else if (total > 150 && total < 200) {
            return new MediumHighPriceCase();
        } else if (total > 100 && total < 150) {
            return new MediumPriceCase();
        } else if (total < 100) {
            return new MediumLowPriceCase();
        } else {
            return new OthersPriceCase();
        }
    }
}
