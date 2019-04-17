package org.smart4j.design.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void ContextInterface() {
        strategy.AlgorithmInterface();
    }
}
