package org.smart4j.design.simplefactoryandstrategy;

public class CashReturn implements CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }
    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
