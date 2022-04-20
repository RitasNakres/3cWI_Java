package at.satir.geometricshapes;

public class Square extends Figure {

    private double lengthA;

    public Square(String name, double lengthA) {
        super(name);
        this.lengthA = lengthA;
    }

    @Override
    public double getArea() {
        double newCalculatedArea = Math.pow(this.lengthA, 2);
        return newCalculatedArea;
    }
}
