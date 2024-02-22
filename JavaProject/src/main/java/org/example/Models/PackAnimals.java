package org.example.Models;

import java.util.ArrayList;

public class PackAnimals extends Animals{

//
    private final ArrayList<PackAnimals> listPackAnimals = new ArrayList<>();

//Getters & Setters

    public ArrayList<PackAnimals> getListPackAnimals() {
        return listPackAnimals;
    }

//Constructor

    public PackAnimals() {
        super();
    }


//Methods
    //Adding
    public void addNewPackAnimal(PackAnimals animal) {
        listPackAnimals.add(animal);
    }

    //ShowCommands
    public void printPackAnimalCommands(PackAnimals animal){
        System.out.println(animal.getCommands());
    }

    //ShowAll
    public void printAll(){
        for (PackAnimals var : this.listPackAnimals) {
            System.out.println(var.toString());
        }
    }
}
