package org.ghizlane;

public class Context {
    private Strategy strategy= new StrategyDefault();
    public void effectuerOperation(){
        System.out.println("****************");
        strategy.operationStrategy();
        System.out.println("=======================");

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
