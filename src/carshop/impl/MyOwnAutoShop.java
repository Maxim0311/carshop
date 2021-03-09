package carshop.impl;

import carshop.cars.Car;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.iterface.Admin;
import carshop.iterface.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    public Car[] cars;

    public double getIncome(){     // Общая стоимость проданных автомобилей
        double summ = 0;
        for (Car car: cars) {
            if (!car.isSellOut)
                summ += car.regularPrice;
        }
        return summ;
    }

    public double getCarPrice(int id){    // Строимость автомобиля с учетом скидки
        return cars[id].getSalePrise();
    }

    public String getCarColor(int id){    // Цвет автомобиля
        return cars[id].color;
    }

    public void purchaseCar(int id){    // Купить автомобиль
        cars[id].isSellOut = false;
    }
}
