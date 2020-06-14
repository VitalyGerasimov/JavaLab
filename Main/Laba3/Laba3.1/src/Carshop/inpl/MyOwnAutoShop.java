package Carshop.inpl;

import Carshop.cars.Ford;
import Carshop.cars.Sedan;
import Carshop.cars.Truck;
import Carshop.interfaces.Admin;
import Carshop.interfaces.Customer;
import Carshop.cars.Car;

public class MyOwnAutoShop implements Admin, Customer {

    public Car [] cars = new Car[5];
    static  int Income;
    public void CreatureCars(){
        cars [0]=new Ford(180,true,2000000,"black",2010,30000);
        cars [1]=new Ford(220, true,3000000,"white",2018,50000);
        cars [2]=new Sedan(200,true,2500000,"black",30);
        cars [3]=new Truck(190,true,2000000,"green",2500);
        cars [4]=new Truck(190,true,2100000,"green",1900);

    }

    public double getIncome() {
        return Income;
    }

    public double getCarsPrice() {
        double money = 0;
        for(Car car: cars){
            money+=car.getSalePrice();
        }
      return money;
    }

    @Override
    public double getCarPrice(int id) {
        return cars[id].getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return cars[id].color;
    }

    @Override
    public void purchaseCar(int id) {
        Income+=cars[id].getSalePrice();
        cars[id].isSellOut=false;

    }
}
