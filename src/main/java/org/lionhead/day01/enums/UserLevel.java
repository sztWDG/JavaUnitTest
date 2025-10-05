package org.lionhead.day01.enums;

// 职责内聚
public enum UserLevel {
    GOLD(10),
    SILVER(5),
    NORMAL(0),
    ;

    public final int discount;

    UserLevel(int discount) {
        this.discount = discount;
    }

}
