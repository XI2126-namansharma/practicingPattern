package com.practiceHere.factoryPattern;

public class Application {
    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();

        Shape shape1= factoryPattern.getShape("CIRCLE");
        System.out.println(shape1.draw());

        Shape shape2= factoryPattern.getShape("SQUARE");
        System.out.println(shape2.draw());

        Shape shape3= factoryPattern.getShape("RECTANGLE");
        System.out.println(shape3.draw());
    }
}