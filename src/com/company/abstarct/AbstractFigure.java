package com.company.abstarct;
import java.util.ArrayList;

public abstract class AbstractFigure {

    private String color;

    public AbstractFigure(){

    }

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
