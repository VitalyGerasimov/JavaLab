package Carshop.cars;

public abstract class Car {
    int speed;
    public boolean isSellOut;
    double regularPrice;
    public String color;
    public abstract double getSalePrice();
}
