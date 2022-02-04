package at.satir.Remote;

public class Battery {
    private boolean chargingStatus;
    private double batteryStatus;
    private String batteryName;

    public Battery(boolean chargingStatus, double batteryStatus, String batteryName) {
        this.chargingStatus = chargingStatus;
        this.batteryStatus = batteryStatus;
        this.batteryName = batteryName;
    }


    public void turnOn() {
        if (this.chargingStatus = false) {
            this.chargingStatus = true;
            this.batteryStatus = this.batteryStatus - (this.batteryStatus / 100 * 0.95);
        } else {
            System.out.println("Mein Name ist " + batteryName + " Mein Verbraucher ist angeschlossen");
        }
    }

    public void turnOff() {
        if (this.chargingStatus = true) {
            this.chargingStatus = false;
            System.out.println("Mein Name ist " + batteryName + " Kein Verbraucher angeschlossen");
        }
    }


    public boolean getChargingStatus() {
        return chargingStatus;
    }

    public double getBatteryStatus() {
        return batteryStatus;
    }
}

