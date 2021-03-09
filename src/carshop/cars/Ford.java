package carshop.cars;

public class Ford extends Car{
    public int year;
    public int manufacturerDiscount;

    public Ford(int Speed, double RegularPrice, String Color, int ManufacturerDiscount){
        this.speed = Speed;
        this.regularPrice = RegularPrice;
        this.color = Color;
        this.manufacturerDiscount = ManufacturerDiscount;
    }

    public double getSalePrise(){
        return this.regularPrice - this.regularPrice * (this.manufacturerDiscount / 100);
    }
}
