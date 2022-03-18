package at.satir.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(70,Engine.tankType.Gasoline);
        Engine e2 = new Engine(120, Engine.tankType.Diesel);

        Producer p1 = new Producer("VW","Germany",5);
        Producer p2 = new Producer("Audi","Germany",10);

        Car c1 = new Car(p1,e1,"red",180,12000);

        c1.getSellingPrice();


    }
}
