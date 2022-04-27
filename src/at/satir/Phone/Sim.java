package at.satir.Phone;

public class Sim {
    private int id;
    private String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public void doCall(String number) {
        System.out.println("Calling: " + number);
    }
}
