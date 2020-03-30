package com.company;

import java.awt.*;
import java.util.Random;

public class SetColor {
    Random random = new Random();
    private String colorName;

    public String setColor(){
        switch(random.nextInt(8)) {    
            case (0):
                colorName = "Red";
                break;
            case (1):
                colorName = "green";
                break;
            case (2):
                colorName = "blue";
                break;
            case (3):
                colorName = "pink";
                break;
            case (4):
                colorName = "yellow";
                break;
            case (5):
                colorName = "magenta";
                break;
            case (6):
                colorName = "orange";
                break;
            case (7):
                colorName = "purple";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + random.nextInt(8));
        }
        return colorName;
    }
}
