package com.company.geometry;

public class Rectangle {
    protected Point p1;
    protected Point p2;



    public Rectangle(int x1, int y1,int x2, int y2){
        p1.x=x1;
        p1.y=y1;
        p2.x=x2;
        p2.y=y2;
    };
    public Rectangle(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }

}
