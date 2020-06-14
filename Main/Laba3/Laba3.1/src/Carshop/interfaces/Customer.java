package Carshop.interfaces;

public interface Customer {
    double getCarsPrice();
    double getCarPrice(int id);
    String getCarColor(int id);
    void purchaseCar(int id);

}
