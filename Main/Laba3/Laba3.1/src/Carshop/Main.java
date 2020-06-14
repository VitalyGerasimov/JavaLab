package Carshop;

import Carshop.inpl.MyOwnAutoShop;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyOwnAutoShop AutoShop = new MyOwnAutoShop();
        AutoShop.CreatureCars();
        System.out.println("Choose the actions: ");
        System.out.println("1 - Buy a car");
        System.out.println("2 - Verify income");
        System.out.println("3 - Show information");
        int i = scanner.nextInt();
        int id;
        switch (i){
            case 1:
                System.out.println("Choose the id: ");
                id = scanner.nextInt();
                AutoShop.purchaseCar(id);
                break;
            case 2:
                System.out.println("Income: "+AutoShop.getIncome());
                break;
            case 3:
                System.out.println("Choose the id: ");
                id = scanner.nextInt();
                System.out.println("Choose 1 - color, 2 - Price: ");
                int ch = scanner.nextInt();
                switch (ch){
                    case 1: System.out.println(AutoShop.getCarColor(id)); break;
                    case 2: System.out.println(AutoShop.getCarPrice(id)); break;
                    default: System.out.println("Error");
                }
        }
    }
}
