package at.satir.Car;

public class Car {

    private Producer producer;
    private Engine engine;
    private String color;
    private double maximumSpeed;
    private double basePrice;
    private double baseConsumption;
    private double mileage;


    public Car(Producer producer, Engine engine, String color, double maximumSpeed, double baseConsumption, double mileage, double basePrice) {
        this.producer = producer;
        this.engine = engine;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.mileage = mileage;
    }

    public double getSellingPrice() {
        double newSellingPrice = this.basePrice * this.producer.getDiscount();
        System.out.println(newSellingPrice);
        return newSellingPrice;
    }

    public void newBaseComsumption() {
        double newFuelConsumption;
        if (this.mileage >= 50000) {
            newFuelConsumption = this.baseConsumption + ((this.baseConsumption / 100) * 9.8);
            setBaseConsumption(newFuelConsumption);
            System.out.println("Der Neue Spritverbrauch beträgt: " + newFuelConsumption + " Liter");
        } else
            System.out.println("Das Auto verbaucht noch den Basisverbrauch");
    }


    public void drive() {
        System.out.println("Ich bin am fahren");
        double newMileage = this.mileage + 4000;
        setMileage(newMileage);
        System.out.println(newMileage);
    }


    public double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }
}
