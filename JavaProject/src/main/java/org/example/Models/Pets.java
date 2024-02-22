package org.example.Models;

import java.util.ArrayList;
import java.util.HashSet;

public class Pets extends Animals{

    //
    private final ArrayList<Pets> listPets = new ArrayList<>();

//Getters & Setters

    public ArrayList<Pets> getListPets() {
        return listPets;
    }

//Constructor

    public Pets() {
        super();
    }

//Methods
    //Adding
    public void addNewPet(Pets animal) {
        listPets.add(animal);
    }

    //ShowCommands
    public void printPetCommands(Pets animal){
        System.out.println(animal.getCommands());
    }

    //ShowAll
    public void printAll(){
        for (Pets var : this.listPets) {
            System.out.println(var.toString());
        }
    }
}
