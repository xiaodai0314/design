package org.smart4j.design.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
