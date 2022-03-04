package at.satir.Remote;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(100);
        Battery b2 = new Battery(80);
        Remote r1 = new Remote(b1,b2);



        r1.turnOn();
        System.out.println(b1.getBatteryStatus());
        System.out.println(b2.getBatteryStatus());

        r1.turnOn();
        System.out.println(b1.getBatteryStatus());
        System.out.println(b2.getBatteryStatus());

        r1.getAllBatteryStatus();





    }
}
