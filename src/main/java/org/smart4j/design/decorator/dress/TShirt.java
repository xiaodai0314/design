package org.smart4j.design.decorator.dress;

public class TShirt extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("T-Shirt");
    }
}
