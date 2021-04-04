package com.practiceHere.factoryPattern;

import com.practiceHere.factoryPattern.Shape;

public class Circle implements Shape {

    @Override
    public String draw() {
        return "INSIDE CIRCLE CLASS";
    }
}