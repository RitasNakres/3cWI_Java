package at.satir.TestOO;

public class Control {
    private int coffeeSize; // 1 - small, 2 - medium, 3 - large
    private int coffeeIntensity;
    private boolean machineStatus;
    private CoffeeContainer coffeeContainer;
    public WaterTank waterTank;


    public Control(boolean machineStatus, CoffeeContainer coffeeContainer, WaterTank waterTank) {
        this.machineStatus = machineStatus;
        this.coffeeContainer = coffeeContainer;
        this.waterTank = waterTank;
    }

    public int getCoffeeSize() {
        return coffeeSize;
    }

    public int getCoffeeIntensity() {
        return coffeeIntensity;
    }

    public void turnOn() {
        if (machineStatus == false) {
            machineStatus = true;
            System.out.println("The machine is ready");
        }
    }

    public void turnOff() {
        if (machineStatus == true) {
            machineStatus = false;
            System.out.println("Shuting down system");
        }
    }

    public int coffeeIntensity(int coffeeStrength) {
        int newCoffeeBeansCapacity;
        if (coffeeIntensity == 1) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 2;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        } else if (coffeeIntensity == 2) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 4;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        } else if (coffeeIntensity == 3) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 6;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        } else if (coffeeIntensity == 4) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 8;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        }
        if (coffeeIntensity == 5) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 10;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        } else if (coffeeIntensity == 6) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 12;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        } else if (coffeeIntensity == 7) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 14;
        } else if (coffeeIntensity == 8) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 16;
        } else if (coffeeIntensity == 9) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 18;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        } else if (coffeeIntensity == 10) {
            newCoffeeBeansCapacity = this.coffeeContainer.getCoffeeCapacity() - 20;
            this.coffeeContainer.setCoffeeCapacity(newCoffeeBeansCapacity);
        }
        return this.coffeeContainer.getCoffeeCapacity();
    }

    public int coffeeSize(int coffeeSize) {
        int newWaterTankStatus;
        if (coffeeSize == 1) {
            newWaterTankStatus = this.waterTank.getMaxWaterLevel() - 40;
            this.waterTank.setMaxWaterLevel(newWaterTankStatus);
        } else if (coffeeSize == 2) {
            newWaterTankStatus = this.waterTank.getMaxWaterLevel() - 120;
            this.waterTank.setMaxWaterLevel(newWaterTankStatus);
        } else if (coffeeSize == 3) {
            newWaterTankStatus = this.waterTank.getMaxWaterLevel() - 200;
            this.waterTank.setMaxWaterLevel(newWaterTankStatus);
        }
        return this.waterTank.getMaxWaterLevel();
    }

    public void fillUpWaterTank(){
        if(this.waterTank.getMaxWaterLevel() < this.coffeeSize){
            this.waterTank.setMaxWaterLevel(1000);
        }
    }

    public void fullUpBeans(){
        if(this.coffeeContainer.getCoffeeCapacity() < this.coffeeIntensity) {
            this.coffeeContainer.setCoffeeCapacity(100);
        }
    }
}



