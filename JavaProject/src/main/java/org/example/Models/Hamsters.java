package org.example.Models;

import java.util.HashSet;

public class Hamsters extends Pets{
//Fields
    private final String type = "Hamster";
    private String name;
    private String dateOfBirth;
    private final HashSet<String> commands = new HashSet<>();

//Constructor
    public Hamsters(String name, String dateOfBirthday, HashSet<String> commands) {
        this.name = name;
        this.dateOfBirth = dateOfBirthday;
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
