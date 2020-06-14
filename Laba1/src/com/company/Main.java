package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("First Number: ");
        double N = console.nextDouble();
        for(int i = 1; i < 2048; i++) {
            double M=i*N+2;
            if (M % 7 == 0) {
                System.out.println(M);
            }
        }
    }}

