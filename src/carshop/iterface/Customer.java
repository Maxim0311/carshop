package carshop.iterface;

public interface Customer {
    double getCarPrice(int id);
    String getCarColor(int id);
    void purchaseCar(int id);
}
