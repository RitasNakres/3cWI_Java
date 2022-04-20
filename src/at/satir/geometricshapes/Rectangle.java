package at.satir.geometricshapes;

public class Rectangle extends Figure{

    public double lengthA;
    public double lengthB;

    public Rectangle(String name, double lengthA, double lengthB) {
        super(name);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    @Override
    public double getArea() {
        double newCalculatedArea = this.lengthA * this.lengthB;
        return newCalculatedArea;
    }
}
