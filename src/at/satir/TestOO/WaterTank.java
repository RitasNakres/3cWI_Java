package at.satir.TestOO;

import at.satir.Phone.PhoneFile;

import java.util.List;

public class WaterTank {
    private int maxWaterLevel;

    public WaterTank(int maxWaterLevel) {
        this.maxWaterLevel = maxWaterLevel;
    }

    public int getMaxWaterLevel() {
        return maxWaterLevel;
    }

    public void setMaxWaterLevel(int maxWaterLevel) {
        this.maxWaterLevel = maxWaterLevel;
    }

    public void printWaterLevel(){
        System.out.println(this.maxWaterLevel);
    }
}
