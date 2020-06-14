package Carshop.cars;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;
    // (вычисляется как цена минус скидка производителя)
    public double getSalePrice(){
        double newPrice = Ford.this.regularPrice-Ford.this.manufacturerDiscount;
        return newPrice;
    };
    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color=color;
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }
}
