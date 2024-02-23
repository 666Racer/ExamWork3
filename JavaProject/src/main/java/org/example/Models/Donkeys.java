package org.example.Models;

import java.util.HashSet;

public class Donkeys extends PackAnimals{
//Fields
    private final String type = "Donkey";
    private String name;
    private String dateOfBirth;
    private static HashSet<String> commands = new HashSet<>();


//Constructor
    public Donkeys(String name, String dateOfBirth, HashSet<String> commands) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

//Getters
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

//Methods

    @Override
    public String toString() {
        return   "----" + type + "-----" +'\n' +
                "Name:"+ ' ' + name +'\n' +
                "Date of birth:"+ ' ' + dateOfBirth + '\n';
    }
}
