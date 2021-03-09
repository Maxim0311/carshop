package carshop.cars;

public class Sedan extends Car{
    public int length;

    public Sedan(int Speed, double RegularPrice, String Color, int Length){
        this.speed = Speed;
        this.regularPrice = RegularPrice;
        this.color = Color;
        this.length = Length;
    }

    public double getSalePrise() {
        if (this.length > 20)
            return this.regularPrice - this.regularPrice * 0.05;
        else
            return this.regularPrice;
    }
}