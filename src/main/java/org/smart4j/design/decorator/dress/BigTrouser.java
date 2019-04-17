package org.smart4j.design.decorator.dress;

public class BigTrouser extends Finery {
    public BigTrouser() {
    }

    @Override
    public void show() {
        System.out.println("BigTrouser");
        super.show();
    }

    public BigTrouser(String name) {
        super(name);
    }
}
