package org.example.Controller;

import org.example.Models.*;
import java.util.HashSet;

public class Controller {
//Fields
    AnimalsList packAnimals = new AnimalsList("PackAnimals");
    AnimalsList pets = new AnimalsList("Pets");

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
                    pets.addNewAnimal(new Dog(name, dateOfBirth, commandsList));
                    break;
                }
                case "2": {
                    HashSet<String> commandsList = new HashSet<String>();
                    String[] commandsParse = commands.split(",");
                    for (String command :
                            commandsParse) {
                        commandsList.add(command.trim().toLowerCase());
                    }
                    pets.addNewAnimal(new Cat(name, dateOfBirth, commandsList));
                    break;
                }
                case "3": {
                    HashSet<String> commandsList = new HashSet<String>();
                    String[] commandsParse = commands.split(",");
                    for (String command :
                            commandsParse) {
                        commandsList.add(command.trim().toLowerCase());
                    }
                    pets.addNewAnimal(new Hamster(name, dateOfBirth, commandsList));
                    break;
                }
                case "4": {
                    HashSet<String> commandsList = new HashSet<String>();
                    String[] commandsParse = commands.split(",");
                    for (String command :
                            commandsParse) {
                        commandsList.add(command.trim().toLowerCase());
                    }
                    packAnimals.addNewAnimal(new Horse(name, dateOfBirth, commandsList));
                    break;
                }
                case "5": {
                    HashSet<String> commandsList = new HashSet<String>();
                    String[] commandsParse = commands.split(",");
                    for (String command :
                            commandsParse) {
                        commandsList.add(command.trim().toLowerCase());
                    }
                    packAnimals.addNewAnimal(new Camel(name, dateOfBirth, commandsList));
                    break;
                }
                case "6": {
                    HashSet<String> commandsList = new HashSet<String>();
                    String[] commandsParse = commands.split(",");
                    for (String command :
                            commandsParse) {
                        commandsList.add(command.trim().toLowerCase());
                    }
                    packAnimals.addNewAnimal(new Donkey(name, dateOfBirth, commandsList));
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

    //print all Animal
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
                for (Animal animal : pets.getListAnimals()) {
                    if (animal instanceof Dog && animal.toString().contains(name)) {
                        Dog dog = (Dog) animal;
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
                for (Animal animal : pets.getListAnimals()) {
                    if (animal instanceof Cat && animal.toString().contains(name)) {
                        Cat cat = (Cat) animal;
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
                for (Animal animal : pets.getListAnimals()) {
                    if (animal instanceof Hamster && animal.toString().contains(name)) {
                        Hamster hamsters = (Hamster) animal;
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
                for (Animal animal : packAnimals.getListAnimals()) {
                    if (animal instanceof Horse && animal.toString().contains(name)) {
                        Horse horse = (Horse) animal;
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
                for (Animal animal : packAnimals.getListAnimals()) {
                    if (animal instanceof Camel && animal.toString().contains(name)) {
                        Camel camels = (Camel) animal;
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
                for (Animal animal : packAnimals.getListAnimals()) {
                    if (animal instanceof Donkey && animal.toString().contains(name)) {
                        Donkey donkeys = (Donkey) animal;
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
                for (Animal animal : pets.getListAnimals()) {
                    if (animal instanceof Dog && animal.toString().contains(name)) {
                        Dog dog = (Dog) animal;
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
                for (Animal animal : pets.getListAnimals()) {
                    if (animal instanceof Cat && animal.toString().contains(name)) {
                        Cat cat = (Cat) animal;
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
                for (Animal animal : pets.getListAnimals()) {
                    if (animal instanceof Hamster && animal.toString().contains(name)) {
                        Hamster hamsters = (Hamster) animal;
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
                for (Animal animal : packAnimals.getListAnimals()) {
                    if (animal instanceof Horse && animal.toString().contains(name)) {
                        Horse horse = (Horse) animal;
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
                for (Animal animal : packAnimals.getListAnimals()) {
                    if (animal instanceof Camel && animal.toString().contains(name)) {
                        Camel camels = (Camel) animal;
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
                for (Animal animal : packAnimals.getListAnimals()) {
                    if (animal instanceof Donkey && animal.toString().contains(name)) {
                        Donkey donkeys = (Donkey) animal;
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
