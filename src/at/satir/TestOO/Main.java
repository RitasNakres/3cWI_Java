package at.satir.TestOO;

public class Main {
    public static void main(String[] args) {

        WaterTank wt = new WaterTank(1000);
        CoffeeContainer cc = new CoffeeContainer(100);
        Control c = new Control(false, cc, wt);
        CoffeeMachine cm = new CoffeeMachine(wt, cc, c);

        c.turnOn();

        c.coffeeIntensity(1);
        c.coffeeSize(1);
        wt.printWaterLevel();
        cm.breedCoffee();

    }
}
