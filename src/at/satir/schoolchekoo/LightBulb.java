package at.satir.schoolchekoo;

public class LightBulb {

    private String name;
    private String color;
    private boolean status;
    private int wattage;

    public LightBulb(String name, String color, boolean getStatus, int wattage) {
        this.name = name;
        this.color = color;
        this.status = getStatus;
        this.wattage = wattage;
    }


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void turnOn() {
        if (this.status = false) {
            this.status = true;
        } else {
            System.out.println("Mein Name ist " + name + " Ich bin bereits eingeschaltet)");
        }
        this.wattage = wattage + 5;
    }

        public void turnOff() {
            if (this.status = true) {
                this.status = false;
            }
    }
}



