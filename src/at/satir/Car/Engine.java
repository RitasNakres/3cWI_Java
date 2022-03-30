package at.satir.Car;

public class Engine {

    public enum tankClassification {Diesel, Gasoline}

    private double horsePower;
    private tankClassification type;

    public Engine(double horsePower, tankClassification type) {
        this.horsePower = horsePower;
        this.type = type;
    }
}
