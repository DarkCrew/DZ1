package com.company.abstarct;

public class kia implements TypeOfCar{


    private String color;
    private String type;

    public kia (String c, String t){
        color = c;
        type = t;
    }

    @Override
    public String getName() {
        return "kia";
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
