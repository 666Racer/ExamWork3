package org.example.Controller;

import org.example.Models.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Controller {
//Fields
    PackAnimals packAnimals = new PackAnimals();
    Pets pets = new Pets();

//Constructor

    public Controller() {
    }

//Methods
    //add Animal
    public void addAnimals(String type, String name, String dateOfBirth, String commands) {
        /* 1 -> Dog
           2 -> Cat
           3 -> Hamster
           4 -> Horse
           5 -> Camel
           6 -> Donkey */

        switch (type) {
            case "1": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                pets.addNewPet(new Dogs(name, dateOfBirth, commandsList));
                break;
            }
            case "2": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                pets.addNewPet(new Cats(name, dateOfBirth, commandsList));
                break;
            }
            case "3": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                pets.addNewPet(new Hamsters(name, dateOfBirth, commandsList));
                break;
            }
            case "4": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                packAnimals.addNewPackAnimal(new Horses(name, dateOfBirth, commandsList));
                break;
            }
            case "5": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                packAnimals.addNewPackAnimal(new Camels(name, dateOfBirth, commandsList));
                break;
            }
            case "6": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                packAnimals.addNewPackAnimal(new Donkeys(name, dateOfBirth, commandsList));
                break;
            }
            default: {
                System.out.println(type + " - Error: this type doesn't exist");
            }
        }
    }

    //print all Animals
    public void printAll(){
        System.out.println("Pets: ");
        pets.printAll();
        System.out.println("Pack animals: ");
        packAnimals.printAll();
    }

    //print Commands
    public void printCommands(){
        System.out.println("Animal commands: ");
        //Animals.printAnimalCommands(Animals animal);
    }

    //add new Command:
    //public void addNewCommand (String type, String commands){
         /* 1 -> Dog
           2 -> Cat
           3 -> Hamster
           4 -> Horse
           5 -> Camel
           6 -> Donkey */
        /*switch (type) {
            case "1": {
                HashSet<String> commandsList = new HashSet<String>();
                String[] commandsParse = commands.split(",");
                for (String command :
                        commandsParse) {
                    commandsList.add(command.trim().toLowerCase());
                }
                Dogs.addNewCommand(command);
                break;
            }
            case "2": {
                Cats.addNewCommand(command);
                break;
            }
            case "3": {
                Hamsters.addNewCommand(command);
                break;
            }
            case "4": {
                Horses.addNewCommand(command);
                break;
            }
            case "5": {
                Camels.addNewCommand(command);
                break;
            }
            case "6": {
                Donkeys.addNewCommand(command);
                break;
            }
            default: {
                System.out.println(type + " - Error: this type doesn't exist");
            }*/
}
