package org.smart4j.design.decorator;

public class Decorator implements Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if(component != null) {
            component.Operation();
        }
    }
}
