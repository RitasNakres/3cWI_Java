package at.satir.ISaHASa;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String street;
    private String name;
    private List <Animal> animals;

    public Zoo(String street, String name) {
        this.street = street;
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void printAnimals() {
        for (Animal animal: this.animals) {
            System.out.println("Animal weight: " + animal.getWeight());
        }
    }

    // + -> public, - -> private
    public void makeShow() {
        System.out.println("The show just has started");
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
