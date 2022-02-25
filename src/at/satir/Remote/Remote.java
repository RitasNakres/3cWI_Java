package at.satir.Remote;
import java.util.List;

public class Remote {
    private Battery battery;
    private List<Battery> batteries;

    public Remote(Battery battery) {
        this.battery = battery;
    }

    public void getAllBatteryStatus() {double getAllBatteryStatus;
        getAllBatteryStatus = (this.battery.getBatteryStatus() + this.battery.getBatteryStatus()) / 2;
    }

}
