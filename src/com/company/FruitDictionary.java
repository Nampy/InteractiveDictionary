package com.company;

import java.util.HashMap;

public class FruitDictionary {

    // fruits with a description
    HashMap<String, String> fruits = new HashMap<>();

    public FruitDictionary(){
        // constructor to instantiate
    }

    //adding new entries to the dictionary
    public void newEntry(String fruitName, String message){
        // populate the dictionary
        fruits.put(fruitName, message);
    }

    // look up the fruits the user wants, if it doesn't exist return an error message

    public void look(String fruitName){

    }
}
