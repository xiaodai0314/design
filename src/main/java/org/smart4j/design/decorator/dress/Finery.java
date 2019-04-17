package org.smart4j.design.decorator.dress;

public class Finery extends Person {
    protected Person component;

    public Finery() {

    }
    public Finery(String name) {
        super(name);
    }

    public void decorate(Person component) {
        this.component = component;
    }
    @Override
    public void show() {
        super.show();
        if(component != null) {
            component.show();
        }
    }
}
