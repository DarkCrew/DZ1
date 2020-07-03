package com.company.abstarct;

public class toyota implements TypeOfCar{

    private String color;
    private String type;

    public toyota (String c, String t){
        color = c;
        type = t;
    }

    @Override
    public String getName() {
        return "toyota";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getTypeCar() {
        return type;
    }
}
