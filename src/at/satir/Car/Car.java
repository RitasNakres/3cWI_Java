package at.satir.Car;

public class Car {

    private Producer producer;
    private Engine engine;
    private String color;
    private double maximumSpeed;
    private double basePrice;


    public Car(Producer producer, Engine engine, String color, double maximumSpeed, double basePrice) {
        this.producer = producer;
        this.engine = engine;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.basePrice = basePrice;
    }


}
