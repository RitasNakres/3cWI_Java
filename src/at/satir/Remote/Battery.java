package at.satir.Remote;
import java.util.ArrayList;
import java.util.List;

public class Battery {
    private boolean chargingStatus;
    private double batteryStatus;
    private List<Battery> batteries;

    public Battery(double batteryStatus, boolean chargingStatus) {
        this.batteryStatus = batteryStatus;
        this.chargingStatus = chargingStatus;
        this.batteries = new ArrayList<>();
    }

    public void addBattery (Battery battery){
        this.batteries.add(battery);
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

//    public void turnOn() {
//        if (this.chargingStatus = false) {
//            this.chargingStatus = true;
//            this.batteryStatus = this.batteryStatus - ((this.batteryStatus / 100) * 5);
//        } else {
//            System.out.println("Mein Verbraucher ist bereits angeschlossen");
//        }
//    }
//
//    public void turnOff() {
//        if (this.chargingStatus = true) {
//            this.chargingStatus = false;
//            System.out.println("Es ist kein Verbraucher angeschlossen");
//        }
//    }

    public boolean getChargingStatus() {
        return chargingStatus;
    }
    public void setChargingStatus(boolean newChargingStatus) {
        this.chargingStatus = newChargingStatus;
    }

    public double getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(double newBatteryStatus) {
        this.batteryStatus = newBatteryStatus;
    }
}

