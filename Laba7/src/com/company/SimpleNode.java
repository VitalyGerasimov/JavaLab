package com.company;

public class SimpleNode implements AbstractNode{
    private final boolean value;

    public SimpleNode(boolean value){
        this.value=value;
    }
    public boolean calculate() {
        return value;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
