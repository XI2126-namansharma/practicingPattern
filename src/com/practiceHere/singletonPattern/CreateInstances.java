package com.practiceHere.singletonPattern;

public class CreateInstances {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = new Singleton();
        Singleton singleton3 = new Singleton();

        System.out.println(singleton.equals(singleton1));
        System.out.println(singleton2.equals(singleton3));
    }
}
