package com.company;

public class NoNode implements AbstractNode{
    private final AbstractNode one;
    public NoNode(AbstractNode one) {
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
