package at.satir.Phone;

public class Phone {
    private SD sdCard;
    private Sim sim;
    private Camera camera;

    public Phone(SD sdCard, Sim sim, Camera camera) {
        this.sdCard = sdCard;
        this.sim = sim;
        this.camera = camera;
    }

    public void doCall(String number) {
        this.sim.doCall(number);
    }
}
