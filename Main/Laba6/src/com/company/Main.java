package com.company;

public class Main {
    private static AbstractNode generateFirst() {
        return new ConjunctionNode(
                new NoNode(new SimpleNode(true)),
                new ConjunctionNode(
                        new SimpleNode(true),
                        new NoNode(new SimpleNode(false))));

    }
    private static NoNode generateSecond() {
        return new NoNode(
                new ConjunctionNode(
                        new NoNode(new SimpleNode(true)),
                        new NoNode(new SimpleNode(false))));
    }
    public static void main(String[] args) {
        AbstractNode first = generateFirst();
        AbstractNode second = generateSecond();
        System.out.println("The first expression is: " + first.toString()
                + "\tValue is: " + first.calculate());
        System.out.println("The second expression is: " + second.toString()
                + "\tValue is: " + second.calculate());
    }
}
