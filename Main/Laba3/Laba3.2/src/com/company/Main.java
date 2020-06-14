package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    System.out.println("Input amount numbers in array");
        int n = scanner.nextInt();
        int [] array = new int[n];
    for(int i=0;i<n;i++){
       array[i]=scanner.nextInt();
    }
        Multiplication mul = new Multiplication();
        Sum sum = new Sum();
        System.out.println("Multiplication:  "+mul.fold(array));
        System.out.println("Sun:  "+sum.fold(array));
    }
}
