package at.satir.geometricshapes;

public class Circle extends Figure {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double pi = Math.PI;
        double newCalculatedArea = Math.pow(this.radius, 2) * pi;
        return newCalculatedArea;
    }
}
