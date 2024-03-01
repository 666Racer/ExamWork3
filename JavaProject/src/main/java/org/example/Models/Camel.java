package org.example.Models;

import java.util.HashSet;

public class Camel extends Animal {
    //Fields
    private final String type = "Camel";
    /*private String name;
    private String dateOfBirth;
    private final HashSet<String> commands = new HashSet<>();*/

    //Constructor
    public Camel(String name, String dateOfBirthday, HashSet<String> commands) {
        super(name, dateOfBirthday, commands);
    }

//Getters
    /*public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

//Methods
*/
    @Override
    public String toString() {
        return   "----" + type + "-----" +'\n' +
                "Name:"+ ' ' + name +'\n' +
                "Date of birth:"+ ' ' + dateOfBirth + '\n'+
                "Commands:" + ' ' + commands + '\n';
    }
}
