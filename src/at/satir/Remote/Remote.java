package at.satir.Remote;


import java.util.ArrayList;
import java.util.List;

public class Remote {
    private Battery battery1;
    private Battery battery2;


    public Remote(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public void turnOn() {
        double newBatteryStatus1 = this.battery1.getBatteryStatus() - 5;
        this.battery1.setBatteryStatus(newBatteryStatus1);
        double newBatteryStatus2 = this.battery2.getBatteryStatus() -5;
        this.battery2.setBatteryStatus(newBatteryStatus2);
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
        System.out.println("Kein Verbraucher angeschlossen");
    }


    public void getAllBatteryStatus() {
        double getAllBatteryStatus = (this.battery1.getBatteryStatus() + this.battery2.getBatteryStatus()) / 2;
    }




}
