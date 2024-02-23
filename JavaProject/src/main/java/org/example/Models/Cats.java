package org.example.Models;

import java.util.HashSet;

public class Cats extends Pets{

//Fields
    private final String type = "Cat";
    private String name;
    private String dateOfBirth;
    private HashSet<String> commands = new HashSet<>();

//Constructor
    public Cats(String name, String dateOfBirth, HashSet<String> commands) {
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
