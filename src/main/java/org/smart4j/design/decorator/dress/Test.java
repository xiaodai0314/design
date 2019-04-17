package org.smart4j.design.decorator.dress;

public class Test {
    public static void main(String[] args) {
        Person dd = new Person("豆豆");
        System.out.println("第一种装扮");

        TShirt tShirt = new TShirt();
        BigTrouser bigTrouser = new BigTrouser();

        tShirt.decorate(dd);
        bigTrouser.decorate(tShirt);
        bigTrouser.show();
    }
}
