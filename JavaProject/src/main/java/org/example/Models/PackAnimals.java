package org.example.Models;

import java.util.ArrayList;

public class PackAnimals extends Animals{

//
    private final ArrayList<PackAnimals> listAnimals = new ArrayList<>();

//Getters & Setters

    public ArrayList<PackAnimals> getListAnimals() {
        return listAnimals;
    }

//Constructor

    public PackAnimals() {
    }


//Methods
    //Adding
    public void addNewPackAnimal(PackAnimals animal) {
        listAnimals.add(animal);
    }

    //ShowAll
    public void printAll(){
        for (PackAnimals var : this.listAnimals) {
            System.out.println(var.toString());
        }
    }
}
