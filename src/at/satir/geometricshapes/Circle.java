package at.satir.geometricshapes;

public class Circle extends Figure{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double pi = 3.14159265359;
        double calculatedArea = 2 * this.radius * pi;
        return calculatedArea;
    }
}
