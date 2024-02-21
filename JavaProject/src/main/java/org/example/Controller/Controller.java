package org.example.Controller;

import org.example.Models.*;

import java.util.HashSet;
import java.util.Scanner;

public class Controller {
//Fields
    PackAnimals packAnimals = new PackAnimals();
    Pets pets = new Pets();

//Constructor

    public Controller() {
    }

//Methods
    //add Animal
    public void addAnimals(String type, String name, String dateOfBirth, HashSet<String> commands) {
        /* 1 -> Dog
           2 -> Cat
           3 -> Hamster
           4 -> Horse
           5 -> Camel
           6 -> Donkey */
        switch (type) {
            case "1": {
                pets.addNewPet(new Dogs(name, dateOfBirth, commands));
                break;
            }
            case "2": {
                pets.addNewPet(new Cats(name, dateOfBirth, commands));
                break;
            }
            case "3": {
                pets.addNewPet(new Hamsters(name, dateOfBirth, commands));
                break;
            }
            case "4": {
                packAnimals.addNewPackAnimal(new Horses(name, dateOfBirth, commands));
                break;
            }
            case "5": {
                packAnimals.addNewPackAnimal(new Camels(name, dateOfBirth, commands));
                break;
            }
            case "6": {
                packAnimals.addNewPackAnimal(new Donkeys(name, dateOfBirth, commands));
                break;
            }
            default: {
                System.out.println(type + " - Error: this type doesn't exist");
            }
        }
    }
    //add new Command:

    public void addCommand (String type, String name, String dateOfBirth, HashSet<String> commands){
        switch (type) {
            case "1": {
                pets.addCommand();
                break;
            }
            case "2": {
                pets.addNewPet(new Cats(name, dateOfBirth, commands));
                break;
            }
            case "3": {
                pets.addNewPet(new Hamsters(name, dateOfBirth, commands));
                break;
            }
            case "4": {
                packAnimals.addNewPackAnimal(new Horses(name, dateOfBirth, commands));
                break;
            }
            case "5": {
                packAnimals.addNewPackAnimal(new Camels(name, dateOfBirth, commands));
                break;
            }
            case "6": {
                packAnimals.addNewPackAnimal(new Donkeys(name, dateOfBirth, commands));
                break;
            }
            default: {
                System.out.println(type + " - Error: this type doesn't exist");
            }
    }
}
