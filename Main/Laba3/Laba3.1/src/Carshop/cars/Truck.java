package Carshop.cars;

public class Truck extends Car{
    int weight;
    // если вес больше 2000, скидка 10%.
    public double getSalePrice(){
        double newPrice=Truck.this.regularPrice;
        if(Truck.this.weight>2000){
            newPrice = Truck.this.regularPrice*0.9;
        }
        return newPrice;
    };
    public Truck(int speed, boolean isSellOut, double regularPrice, String color,int weight){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color=color;
        this.weight=weight;
    }
}
