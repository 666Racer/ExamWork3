package org.example.Models;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Animals {

    protected String name;
    protected String dateOfBirth;
    protected HashSet<String> commands = new HashSet<>();
    public Animals(String name, String dateOfBirth, String commands) {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public HashSet<String> getCommands() {
        return commands;
    }


    public void addNewCommand(String command){
        this.commands.add(command);
    }

    public void printAnimalCommands(){
        if(!this.commands.isEmpty()){
            System.out.print("\n Commands of this animal: ");
            for (String com:this.commands) {
                System.out.print(com +' ');
            }
            System.out.println();
        }else{
            System.out.println("\nNo commands!\n");
        }
    }

    private final ArrayList<Animals> listAllAnimals = new ArrayList<>();

    public ArrayList<Animals> getListAllAnimals() {
        return listAllAnimals;
    }
}
