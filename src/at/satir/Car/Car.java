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

    public double getSellingPrice(){
        return basePrice * this.producer.getDiscount();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
}
}
