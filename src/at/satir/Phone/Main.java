package at.satir.Phone;

public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(1, "06606669451");
        SD sdCard = new SD(100000);
        Camera camera = new Camera();

        Phone phone = new Phone(sdCard, sim, camera);
        phone.doCall("06606438091");

        phone.takePicture();
        phone.takePicture();
        phone.printFiles();
        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}
