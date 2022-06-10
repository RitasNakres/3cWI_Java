package at.satir.TestOO;

public class CoffeeMachine {
    private WaterTank waterTank;
    private CoffeeContainer coffeeContainer;
    private Control control;

    public CoffeeMachine(WaterTank waterTank, CoffeeContainer coffeeContainer, Control control) {
        this.waterTank = waterTank;
        this.coffeeContainer = coffeeContainer;
        this.control = control;
    }


    public void breedCoffee() {
        if (this.waterTank.getMaxWaterLevel() > this.control.coffeeSize(1) && this.coffeeContainer.getCoffeeCapacity() > this.control.coffeeIntensity(1)) {
            System.out.println("Coffee is being breed");
        } else {
            System.out.println("Check on the WaterTank and CoffeeContainer");
        }
    }


}
