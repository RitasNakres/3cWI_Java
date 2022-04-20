package at.satir.geometricshapes;

public class Figure {
    private String name;
    private double area;


    public Figure(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        double calculatedArea = area;
        return calculatedArea;
    }

}
