package at.satir.geometricshapes;

public class Cube extends Figure {

    private double lengthA;

    public Cube(String name, double lengthA) {
        super(name);
        this.lengthA = lengthA;
    }

    @Override   public double getArea() {
        double newCalculatedArea = 6 * Math.pow(this.lengthA, 2);
        return newCalculatedArea;
    }
}
