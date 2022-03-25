package at.satir.Car;

public class Engine {

    public enum tankType {Diesel, Gasoline}

    private double horsePower;
    private tankType type;

    public Engine(double horsePower, tankType type) {
        this.horsePower = horsePower;
        this.type = type;
    }
}
