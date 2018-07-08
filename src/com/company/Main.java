package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        FruitDictionary fruitDictionary = new FruitDictionary();
        fruitDictionary.newEntry("Apple", "A fruit that grows on trees");
        System.out.println(fruitDictionary.look("Banana"));
    }
}
