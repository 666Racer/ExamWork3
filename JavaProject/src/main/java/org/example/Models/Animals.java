package org.example.Models;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Animals {

    private String name;
    private String dateOfBirth;
    private HashSet<String> commands = new HashSet<>();
    private Animals(String name, String dateOfBirth, String commands) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = new HashSet<String>();
        String[] commandsParse = commands.split(",");
        for (String command :
                commandsParse) {
            this.commands.add(command.trim().toLowerCase());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public HashSet<String> getCommands() {
        return commands;
    }

    /*public void setCommands(HashSet<String> commands) {
        this.commands = commands;
    }*/

    public void addNewCommand(String command){
        this.commands.add(command);
    }

    public void printAnimalCommands(Animals animal){
        System.out.println(animal.getCommands());
    }

    private final ArrayList<Animals> listAllAnimals = new ArrayList<>();

    public ArrayList<Animals> getListAllAnimals() {
        return listAllAnimals;
    }
}
