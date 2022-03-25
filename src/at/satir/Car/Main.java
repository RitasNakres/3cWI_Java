package at.satir.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(70, Engine.tankType.Gasoline);
        Engine e2 = new Engine(120, Engine.tankType.Diesel);

        Producer p1 = new Producer("VW", "Germany", 0.95);
        Producer p2 = new Producer("Audi", "Germany", 0.90);

        Car c1 = new Car(p1, e1, "red", 160, 10, 46000, 12500);
        Car c2 = new Car(p2, e2, "black", 190, 10, 46000, 20000);

        c1.drive();
        c2.drive();
        c1.newBaseComsumption();
        c2.newBaseComsumption();
    }
}
