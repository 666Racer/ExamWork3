package org.example.Models;

import java.util.HashSet;

public class Dogs extends Pets{
//Fields
    private final String type = "Dog";
    private String name;
    private String dateOfBirth;
    private HashSet<String> commands = new HashSet<>();

//Constructor
    public Dogs(String name, String dateOfBirth, HashSet<String> commands) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

//Getters & Setters
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

    //Methods

    public void printAllCommands(){
        for (String com:this.commands) {
            System.out.print(com +' ');
        }
    }

    @Override
    public String toString() {
        return   "----" + type + "-----" +'\n' +
                "Name:"+ ' ' + name +'\n' +
                "Date of birth:"+ ' ' + dateOfBirth + '\n';
    }
}
