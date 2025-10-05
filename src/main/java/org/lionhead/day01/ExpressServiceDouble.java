package org.lionhead.day01;

public class ExpressServiceDouble extends ExpressService{
    private int todayExpressPrice;

    private int insurePrice;

    private int handFee;

    public ExpressServiceDouble(int todayExpressPrice, int insurePrice, int handFee) {
        this.todayExpressPrice = todayExpressPrice;
        this.insurePrice = insurePrice;
        this.handFee = handFee;
    }

    public int queryHandFee(){
        return handFee;
    }

    public int queryExpressPrice() {
        return todayExpressPrice;
    }

    public int queryHalfExpressPrice() {
        return todayExpressPrice / 2;
    }

    public int queryInsureExpressPrice() {
        return insurePrice;
    }
}
