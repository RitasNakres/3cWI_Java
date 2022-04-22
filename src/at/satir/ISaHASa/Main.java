package at.satir.ISaHASa;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40,20);
        Animal a2 = new Animal(50,30);

        Zoo zoo = new Zoo("Kinderzoo","Elefantenstrasse");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);

        Dog d1 = new Dog(20,10);
        zoo.addAnimal(d1);
        zoo.printAnimals();



    }
}
