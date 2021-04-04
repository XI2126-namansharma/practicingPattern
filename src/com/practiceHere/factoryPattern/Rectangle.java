package com.practiceHere.factoryPattern;

import com.practiceHere.factoryPattern.Shape;

public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "INSIDE RECTANGLE CLASS";
    }
}