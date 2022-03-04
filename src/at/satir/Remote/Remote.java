package at.satir.Remote;


public class Remote {
    private Battery batteryOne;
    private Battery batteryTwo;


    public Remote(Battery batteryOne, Battery batteryTwo) {
        this.batteryOne = batteryOne;
        this.batteryTwo = batteryTwo;
    }

    public void turnOn() {
        this.batteryOne.givePower();
        this.batteryTwo.givePower();
    }

    public void turnOff() {
        this.batteryOne.loaderNotPluggedIn();
        this.batteryTwo.loaderNotPluggedIn();
    }


    public double getAllBatteryStatus() {
        double batteryOneStatus = this.batteryOne.getBatteryStatus();
        // this.batteryOne.setBatteryStatus(batteryOneStatus);
        double batteryTwoStatus = this.batteryTwo.getBatteryStatus();
        // this.batteryTwo.setBatteryStatus(batteryTwoStatus);
        double averageBatteryStatus = (batteryOneStatus + batteryTwoStatus) / 2;
        return averageBatteryStatus;
    }
}
