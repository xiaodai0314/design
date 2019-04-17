package org.smart4j.design.simplefactoryandstrategy;

public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
