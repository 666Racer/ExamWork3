package org.example.Models;

import java.util.ArrayList;

public class AnimalsList {
    String name;
    private final ArrayList<Animals> listAnimals = new ArrayList<>();
    public ArrayList<Animals> getListAnimals() {
        return listAnimals;
    }

//Constructor

    public AnimalsList(String name) {
        this.name = name;
    }

    //Methods
    //Adding
    public void addNewAnimal(Animals animal) {
        listAnimals.add(animal);
    }

    //ShowAll
    public void printAll(){
        for (Animals var : this.listAnimals) {
            System.out.println(var.toString());
        }
    }
}
