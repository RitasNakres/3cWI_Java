package at.satir.objects;

public class Engine {

    public enum TYPE {DIESEL, BENZIN, ELEKTRO}

    private TYPE type;
    private int power;


    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;
    }

    public TYPE getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
