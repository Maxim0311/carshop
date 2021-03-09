package carshop;

import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.impl.MyOwnAutoShop;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop MyShop = new MyOwnAutoShop();

        MyShop.cars[0] = new Sedan(250, 2200000, "Black", 22);
        MyShop.cars[1] = new Ford(250, 1650000, "Black", 0);
        MyShop.cars[2] = new Ford(250, 1350000, "Black", 10);
        MyShop.cars[3] = new Truck(250, 12500000, "Black", 1800);
        MyShop.cars[4] = new Truck(250, 9000000, "Black", 2300);

        System.out.println("Общая стоимость проданных автомобилей: " + MyShop.getIncome());
    }
}
