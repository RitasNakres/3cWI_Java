package at.satir.schoolchekoo;

public class Main {
    public static void main(String[] args) {

        LightBulb lb1 = new LightBulb("LEDEins","red",true, 5);
        System.out.println(lb1.getStatus());
        lb1.turnOn();
        System.out.println(lb1.getStatus());
    }
}
