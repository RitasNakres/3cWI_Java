package at.satir.geometricshapes;

public class Main {
    public static void main(String[] args) {

        Figure f1 = new Figure("Figure1");
        System.out.println(f1.getArea());

        Circle c1 = new Circle("c1",4);
        double result = c1.getArea();
        System.out.println(result);
        System.out.println(c1.getName());

        Rectangle r1 = new Rectangle("r1",12,6);
        double result2 = r1.getArea();
        System.out.println(result2);
        System.out.println(r1.getName());
    }
}
