package at.satir.Remote;

import java.util.ArrayList;
import java.util.List;

public class Battery {

    private double batteryStatus;
    private List<Battery> batteries;

    public Battery(double batteryStatus) {
        this.batteryStatus = batteryStatus;
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public double getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(double newBatteryStatus) {

        this.batteryStatus = newBatteryStatus;
    }

    public void givePower() {
        this.batteryStatus = this.batteryStatus - 5;
        System.out.println("Verbraucher angeschlossen");
    }
}

