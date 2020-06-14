package com.company;

public class NOT implements AbstractNode{
    private final AbstractNode one;
    public NOT(AbstractNode one) {
        this.one = one;

    }

    @Override
    public boolean calculate() {
        return !one.calculate() ;
    }
    @Override
    public String toString() {
        return "NOT(" + one+ ")";
    }
}
