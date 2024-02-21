package org.example.Models;

import java.util.ArrayList;
import java.util.HashSet;

public class Pets extends Animals{

    //
    private final ArrayList<Pets> listAnimals = new ArrayList<>();

//Getters & Setters

    public ArrayList<Pets> getListAnimals() {
        return listAnimals;
    }

//Constructor

    public Pets() {
    }

//Methods
    //Adding
    public void addNewPet(Pets animal) {
        listAnimals.add(animal);
    }

    public void addCommand(String command){
        HashSet<String> h = new HashSet<String>();;
        h.add(command);
    }
    //ShowAll
    public void printAll(){
        for (Pets var : this.listAnimals) {
            System.out.println(var.toString());
        }
    }
}
