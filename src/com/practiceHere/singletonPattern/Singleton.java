package com.practiceHere.singletonPattern;

public class Singleton {

    // Created Instance
    public static Singleton instance = null;

    // Constructor
    public Singleton() {
    }

    // Getting Instance
    public static Singleton getInstance() {
        if(instance==null)
            instance = new Singleton();
        return instance;
    }
}