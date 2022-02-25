package at.satir.Remote;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(100, false);
        Battery b2 = new Battery(80, true);
        Remote r1 = new Remote(b1);
        r1.addBattery(b2);
        b1.setBatteryStatus();


        b1.turnOff();
        b2.turnOn();
        b1.getBatteryStatus();
        r1.getAllBatteryStatus();
    }
}
