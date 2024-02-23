package org.example.Models;

import java.util.ArrayList;
import java.util.HashSet;

public class Pets extends Animals{

//List of Pets
    private final ArrayList<Pets> listPets = new ArrayList<>();

//Getters

    public ArrayList<Pets> getListPets() {
        return listPets;
    }

//Constructor

    public Pets() {
        super(Animals.getName(),Animals.getDateOfBirth(),Animals.getCommands());
    }

//Methods
    //Adding
    public void addNewPet(Pets animal) {
        listPets.add(animal);
    }

    //ShowAll
    public void printAll(){
        for (Pets var : this.listPets) {
            System.out.println(var.toString());
        }
    }
}
