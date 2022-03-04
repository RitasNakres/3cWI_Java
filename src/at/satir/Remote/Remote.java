package at.satir.Remote;
import java.util.ArrayList;
import java.util.List;

public class Remote {
    private Battery batteryOne;
    private Battery batteryTwo;


    public Remote(Battery battery1, Battery battery2) {
        this.batteryOne = battery1;
        this.batteryTwo = battery2;
    }

    public void turnOn() {
        double newBatteryStatus1 = this.batteryOne.getBatteryStatus() - 5;
        this.batteryOne.setBatteryStatus(newBatteryStatus1);
        double newBatteryStatus2 = this.batteryTwo.getBatteryStatus() -5;
        this.batteryTwo.setBatteryStatus(newBatteryStatus2);
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }


    public void getAllBatteryStatus() {
        double getAllBatteryStatus = (this.batteryOne.getBatteryStatus() + this.batteryTwo.getBatteryStatus()) / 2;
    }
}
