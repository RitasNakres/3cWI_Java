package at.satir.ISaHASa;

public class Zoo {
    private String street;
    private String name;

    public Zoo(String street, String name) {
        this.street = street;
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
