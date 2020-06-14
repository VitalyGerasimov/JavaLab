package Carshop.cars;

public class Sedan extends Car{
    int length;
    // (если длина больше 20, скидка 5%)
    public double getSalePrice(){
        double newPrice=Sedan.this.regularPrice;
        if (Sedan.this.length>20) {
            newPrice = newPrice * 0.95;
        }
        return newPrice;
    };
    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color=color;
        this.length=length;
    }

}
