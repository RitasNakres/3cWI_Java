package at.satir.TestOO;

public class CoffeeContainer {
    private int coffeeCapacity;

    public CoffeeContainer(int coffeeCapacity) {
        this.coffeeCapacity = coffeeCapacity;
    }

    public void printCoffeeCapacity(){
        System.out.println(this.coffeeCapacity);
    }

    public int getCoffeeCapacity() {
        return coffeeCapacity;
    }

    public void setCoffeeCapacity(int coffeeCapacity) {
        this.coffeeCapacity = coffeeCapacity;
    }
}
