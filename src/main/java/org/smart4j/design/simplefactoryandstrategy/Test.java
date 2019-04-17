package org.smart4j.design.simplefactoryandstrategy;

public class Test {
    static double total = 0.0d;
    static double price = 1000d;
    public static void main(String[] args) {
        CashContext csuper = new CashContext("打八折");
        double totalPrices = 0d;
        totalPrices = csuper.getResult(price);
        System.out.println(totalPrices);
    }
}
