package com.company;

import com.company.abstarct.TypeOfCar;
import com.company.abstarct.kia;
import com.company.abstarct.toyota;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        ArrayList<TypeOfCar> types = new ArrayList<>();
        TypeOfCar type = new kia("Red", "jeep");
        types.add(type);
        types.add(new toyota ("Black", "sedan"));

        printTypes(types);
    }

    public static void printTypes(ArrayList<TypeOfCar> types){
        for (TypeOfCar type : types){
            System.out.println("Name: " + type.getName());
            System.out.println("Color: " + type.getColor());
            System.out.println("Type: " + type.getTypeCar());
        }

    }
}
