package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        List <Couple> couples = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of couples:  ");
        int n = scanner.nextInt();
        System.out.println("Enter couples:  ");
        for(int i=0;i<n;i++ ){
        System.out.print("Enter first number of "+ (i+1) +"th couple: " );
        int x = scanner.nextInt();
        System.out.print("Enter second number of "+ (i+1) +"th couple: " );
        int y = scanner.nextInt();
        Couple couple = new Couple(x,y);
        couples.add(couple);
        }
        Collections.sort(couples);
        for(Couple couple:couples) {System.out.println(couple.toString());}
        }
    }

