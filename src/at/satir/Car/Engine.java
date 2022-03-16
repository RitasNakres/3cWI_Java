package at.satir.Car;

public class Engine {

    enum tankType {Diesel, Benzin}
    private double horsepower;

    public Engine(double horsepower) {
        this.horsepower = horsepower;
    }
}
