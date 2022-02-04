package at.satir.Remote;

import at.satir.objects.Producer;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(true,150,"BatteryOne");
        Battery b2 = new Battery(false,89,"BatteryTwo");

        b1.turnOff();
        b2.turnOn();
        b1.getBatteryStatus();
        b2.getBatteryStatus();
    }
}
