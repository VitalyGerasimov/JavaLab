package com.company;

import java.util.ArrayList;
import java.util.Collection;


public class Main {


    public static void main(String[] args) {
        Collection <AbstractNode> list = new ArrayList<>();
        list.add(new SimpleNode(true));
        list.add( new NOT(new SimpleNode(false)));
        list.add(new NOT(new SimpleNode(true)));
	    ConjanctionNode first = new ConjanctionNode(list);

        Collection <AbstractNode> list2 = new ArrayList<>();
	    list2.add(new NOT(new SimpleNode(true)));
	    list2.add(new NOT(new SimpleNode(false)));
	    NOT second = new NOT( new ConjanctionNode(list2));

        System.out.println("The first expression is: " + first
                + "\tValue is: " + first.calculate());
        System.out.println("The second expression is: " + second
                + "\tValue is: " + second.calculate());




    }
}
