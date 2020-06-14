package com.company;

import java.util.Collection;

public class ConjanctionNode implements AbstractNode{
    private final Collection<AbstractNode> list;

    public ConjanctionNode(Collection<AbstractNode> list){
        this.list=list;
    }
    public boolean calculate(){
        boolean result = true;
        for(AbstractNode node: list){
            result=result&&node.calculate();
        }
        return result;

    }
    public String toString() {
        String result = "";
        boolean first = true;
        for (AbstractNode node : list) {
            if (!first) result += " + ";
            first = false;

            result += "(" + node + ")";
            }
        return result;
        }

}
