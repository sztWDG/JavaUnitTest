package org.lionhead.day01;

import java.util.Map;

public class ExpressServiceDouble extends ExpressService{
    private int todayExpressPrice;

    private int insurePrice;

    private int handFee;

    // 换成一个对象
    public Map<String, Integer> spy;

    public ExpressServiceDouble(int todayExpressPrice, int insurePrice, int handFee) {
        this.todayExpressPrice = todayExpressPrice;
        this.insurePrice = insurePrice;
        this.handFee = handFee;
    }

    public int queryHandFee(){
        return handFee;
    }

    public int queryExpressPrice() {
        System.out.println("queryExpressPrice");
        spy.put("queryExpressPrice", 1);
        return todayExpressPrice;
    }

    public int queryHalfExpressPrice() {
        spy.put("queryHalfExpressPrice", 1);
        return todayExpressPrice / 2;
    }

    public int queryInsureExpressPrice() {
        spy.put("queryInsureExpressPrice", 1);
        return insurePrice;
    }
}
