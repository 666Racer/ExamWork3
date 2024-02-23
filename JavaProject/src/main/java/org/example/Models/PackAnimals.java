package org.example.Models;

import java.util.ArrayList;

public class PackAnimals extends Animals{

//List of Pack Animals
    private final ArrayList<PackAnimals> listPackAnimals = new ArrayList<>();

//Getters

    public ArrayList<PackAnimals> getListPackAnimals() {
        return listPackAnimals;
    }

//Constructor

    public PackAnimals() {
        super(Animals.getName(),Animals.getDateOfBirth(),Animals.getCommands());
    }


//Methods
    //Adding
    public void addNewPackAnimal(PackAnimals animal) {
        listPackAnimals.add(animal);
    }

    //ShowAll
    public void printAll(){
        for (PackAnimals var : this.listPackAnimals) {
            System.out.println(var.toString());
        }
    }
}
