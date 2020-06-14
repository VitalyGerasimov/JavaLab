package com.company;
import java.util.Scanner;
import  com.company.geometry.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the center of the circle:");
        System.out.print("x:  ");
        int x = scanner.nextInt();
        System.out.print("y:  ");
        int y = scanner.nextInt();
        Point point=new Point(x,y);
        System.out.print("R:  ");
        int R = scanner.nextInt();
        Circle circle=new Circle(point,R);

        System.out.println("Enter the value of the tested point of the circle:");
        System.out.print("x:  ");
        x = scanner.nextInt();
        System.out.print("y:  ");
        y = scanner.nextInt();
        point.setx(x);
        point.sety(y);
        boolean v = Circle.inside(circle,point);
        if (v=true){System.out.println("The point inside the circle"); }
        else{System.out.println("The point don't inside the circle");}
    }
}
