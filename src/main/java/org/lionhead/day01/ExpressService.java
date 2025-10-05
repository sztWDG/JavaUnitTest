package org.lionhead.day01;

import java.util.logging.Handler;

public class ExpressService {

    private final int todayExpressPrice = 20;

    private  int insurePrice = 5;

    private int handFee = 5;

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
