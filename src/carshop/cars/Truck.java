package carshop.cars;

public class Truck extends Car {
    public int weight;

    public Truck(int Speed, double RegularPrice, String Color, int Weight){
        this.speed = Speed;
        this.regularPrice = RegularPrice;
        this.color = Color;
        this.weight = Weight;
    }

    public double getSalePrise(){
        if (this.weight > 2000){
            return this.regularPrice - this.regularPrice * 0.1;
        } else
            return this.regularPrice;
    }
}
