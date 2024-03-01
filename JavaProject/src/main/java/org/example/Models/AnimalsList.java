package org.example.Models;

import java.util.ArrayList;

public class AnimalsList {
    String name;
    private final ArrayList<Animal> listAnimals = new ArrayList<>();
    public ArrayList<Animal> getListAnimals() {
        return listAnimals;
    }

//Constructor

    public AnimalsList(String name) {
        this.name = name;
    }

    //Methods
    //Adding
    public void addNewAnimal(Animal animal) {
        listAnimals.add(animal);
    }

    //ShowAll
    public void printAll(){
        for (Animal var : this.listAnimals) {
            System.out.println(var.toString());
        }
    }
}
