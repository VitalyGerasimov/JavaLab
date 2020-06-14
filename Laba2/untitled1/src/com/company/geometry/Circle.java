package com.company.geometry;
import java.lang.Math;
public class Circle {
    protected Point p;
    protected double R;

    public Circle(Point p, int R){
        this.p=p;
        this.R=R;
    }
    public static boolean inside(Circle circle, Point point){
        boolean v=true;
        double h = Math.sqrt(circle.p.x*point.x+circle.p.y*point.y);
        if(h>circle.R){v=false;}
        return v;
    }

    public void getPoint(){
    System.out.println("X:  "+Circle.this.p.x);
    System.out.println("Y:  "+Circle.this.p.y);
    }
    public double getR(){
        return Circle.this.R;
    }
}
