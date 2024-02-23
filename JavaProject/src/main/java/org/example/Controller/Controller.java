package org.example.Controller;

import org.example.Models.*;
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
    public void addAnimals(String type, String name, String dateOfBirth, String commands) throws Exception {
        /* 1 -> Dog
           2 -> Cat
           3 -> Hamster
           4 -> Horse
           5 -> Camel
           6 -> Donkey */
        try (Counter counter = new Counter()) {
            counter.add(name, dateOfBirth, commands);
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
                System.out.println();
                System.out.println('\n' + name + " added to the shelter!\n" +
                        "His number is -> " + counter.getInstanceCount() + '\n');
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
    public void printCommands(String type, String name){
        /* 1 -> Dog
           2 -> Cat
           3 -> Hamster
           4 -> Horse
           5 -> Camel
           6 -> Donkey */
        switch (type) {
            case "1": {
                boolean flag = false;
                for (Pets animal : pets.getListPets()) {
                    if (animal instanceof Dogs && animal.toString().contains(name)) {
                        Dogs dog = (Dogs) animal;
                        dog.printAnimalCommands();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "2": {
                boolean flag = false;
                for (Pets animal : pets.getListPets()) {
                    if (animal instanceof Cats && animal.toString().contains(name)) {
                        Cats cat = (Cats) animal;
                        cat.printAnimalCommands();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "3": {
                boolean flag = false;
                for (Pets animal : pets.getListPets()) {
                    if (animal instanceof Hamsters && animal.toString().contains(name)) {
                        Hamsters hamsters = (Hamsters) animal;
                        hamsters.printAnimalCommands();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found!\n");
                }
                break;
            }
            case "4": {
                boolean flag = false;
                for (PackAnimals animal : packAnimals.getListPackAnimals()) {
                    if (animal instanceof Horses && animal.toString().contains(name)) {
                        Horses horse = (Horses) animal;
                        horse.printAnimalCommands();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "5": {
                boolean flag = false;
                for (PackAnimals animal : packAnimals.getListPackAnimals()) {
                    if (animal instanceof Camels && animal.toString().contains(name)) {
                        Camels camels = (Camels) animal;
                        camels.printAnimalCommands();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "6": {
                boolean flag = false;
                for (PackAnimals animal : packAnimals.getListPackAnimals()) {
                    if (animal instanceof Donkeys && animal.toString().contains(name)) {
                        Donkeys donkeys = (Donkeys) animal;
                        donkeys.printAnimalCommands();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            default: {
                System.out.println();
                System.out.println(type + " - Error: this type doesn't exist");
            }

        }
    }

    //add new Command:
    public void addNewCommand(String type, String name, String newCommand){
        /* 1 -> Dog
           2 -> Cat
           3 -> Hamster
           4 -> Horse
           5 -> Camel
           6 -> Donkey */
        switch (type) {
            case "1": {
                boolean flag = false;
                for (Pets animal : pets.getListPets()) {
                    if (animal instanceof Dogs && animal.toString().contains(name)) {
                        Dogs dog = (Dogs) animal;
                        dog.addNewCommand(newCommand);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "2": {
                boolean flag = false;
                for (Pets animal : pets.getListPets()) {
                    if (animal instanceof Cats && animal.toString().contains(name)) {
                        Cats cat = (Cats) animal;
                        cat.addNewCommand(newCommand);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "3": {
                boolean flag = false;
                for (Pets animal : pets.getListPets()) {
                    if (animal instanceof Hamsters && animal.toString().contains(name)) {
                        Hamsters hamsters = (Hamsters) animal;
                        hamsters.addNewCommand(newCommand);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found!\n");
                }
                break;
            }
            case "4": {
                boolean flag = false;
                for (PackAnimals animal : packAnimals.getListPackAnimals()) {
                    if (animal instanceof Horses && animal.toString().contains(name)) {
                        Horses horse = (Horses) animal;
                        horse.addNewCommand(newCommand);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "5": {
                boolean flag = false;
                for (PackAnimals animal : packAnimals.getListPackAnimals()) {
                    if (animal instanceof Camels && animal.toString().contains(name)) {
                        Camels camels = (Camels) animal;
                        camels.addNewCommand(newCommand);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            case "6": {
                boolean flag = false;
                for (PackAnimals animal : packAnimals.getListPackAnimals()) {
                    if (animal instanceof Donkeys && animal.toString().contains(name)) {
                        Donkeys donkeys = (Donkeys) animal;
                        donkeys.addNewCommand(newCommand);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("\nAnimal not found\n");
                }
                break;
            }
            default: {
                System.out.println();
                System.out.println(type + " - Error: this type doesn't exist");
            }

        }
    }
}
