package com.company;

public class ListElement {
    private final int value;
    private ListElement next;

    public ListElement(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
    public ListElement getNext(){
        return next;
    }
    public void setNext(ListElement next){
        this.next=next;
    }
    public void showListElements(ListElement first){
        if (first!=null)
         {
            System.out.println("Number:   "+first.getValue()+" Remainder of dividing by 7:  "+first.getValue()%7);
            showListElements(first.getNext());
        }
    }
}
