package at.satir.Phone;

public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(1,"06606669451");
        SD sdCard = new SD(100000);
        Camera camera = new Camera();

        Phone phone = new Phone(sdCard,sim,camera);

    }
}
