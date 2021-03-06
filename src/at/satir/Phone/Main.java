package at.satir.Phone;

public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(1, "06606669451");
        SD sdCard = new SD(1250);
        Camera camera = new Camera(12, "Maincamera");
        Camera frontCamera = new Camera(6, "Frontcamera");
        PhoneFile file = new PhoneFile("jpeg", 100, "pic1");

        Phone phone = new Phone(sdCard, sim, camera);
        phone.takePicture(2);
        phone.takePicture(3);
        phone.printFiles();
        System.out.println("Capacity left: " + sdCard.getFreeSpace() + "MB");
    }
}
