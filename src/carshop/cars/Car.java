package carshop.cars;

public abstract class Car {
    public int speed;
    public boolean isSellOut = true;
    public double regularPrice;
    public String color;
    public abstract double getSalePrise();
}
