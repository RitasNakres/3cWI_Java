package at.satir.Remote;

public class Battery {

    private double batteryStatus;


    public Battery(double batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public double getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(double newBatteryStatus) {
        this.batteryStatus = newBatteryStatus;
    }

    public void givePower() {
        this.batteryStatus = this.batteryStatus - 5;
        System.out.println("Verbraucher angeschlossen " + batteryStatus + "%");
    }

    public void loaderNotPluggedIn() {
        System.out.println("Kein Verbraucher angeschlossen " + batteryStatus + "%");
    }

}

