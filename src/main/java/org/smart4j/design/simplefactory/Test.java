package org.smart4j.design.simplefactory;

public class Test {
    public static void main(String[] args) throws Exception{
        Operation  operation = OperationFactory.createOperate("/");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
