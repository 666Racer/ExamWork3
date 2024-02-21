package org.example.Models;

import java.util.ArrayList;

abstract class Animals {

    private final ArrayList<Animals> listAllAnimals = new ArrayList<>();

    public ArrayList<Animals> getListAllAnimals() {
        return listAllAnimals;
    }
}
