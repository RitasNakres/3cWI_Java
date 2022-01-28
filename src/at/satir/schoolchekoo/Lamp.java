package at.satir.schoolchekoo;

public class Lamp {
private LightBulb lightbulb;
private boolean status;
private double wattage;



    public Lamp (LightBulb lightbulb, boolean status, double wattage) {
        this.lightbulb = lightbulb;
        this.status = status;
        this.wattage = wattage;
    }

    public void addLightElement() {
        String lightElement = this.lightbulb.getName();
    }

    public void setTurnAllOn(boolean getAllStatus) {
        this.status = getAllStatus;
    }

    public void getOverallPowerUsage(double usedWattage) {
        this.wattage = usedWattage;
    }

    public void printNamesOfLightElements() {
        String nameOfLightBulbs = this.lightbulb.getName();
    }

}

