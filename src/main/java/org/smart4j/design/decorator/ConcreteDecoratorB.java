package org.smart4j.design.decorator;

public class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("对装饰对象B的操作");
    }
    private void addedBehavior() {

    }
}
