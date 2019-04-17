package org.smart4j.design.simplefactoryandstrategy;

/**
 * 打折
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.valueOf(moneyRebate);
    }
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
