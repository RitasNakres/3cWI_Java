package at.satir.Car;

public class Producer {

    private String name;
    private String originatingCountry;
    private double discount;

    public Producer(String name, String originCountry, double discount) {
        this.name = name;
        this.originatingCountry = originCountry;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
