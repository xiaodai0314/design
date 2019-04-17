package org.smart4j.design.decorator;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New state";
        System.out.println("对装饰对象A的操作");
    }
}
