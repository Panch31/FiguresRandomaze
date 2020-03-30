package com.company;

import java.util.Random;

public class RandomFigures {
    static public Figure randomFigures() {
        Random randomFigures = new Random();
        Figure figure;
        switch (randomFigures.nextInt(4)) {
            case (0):
                figure = new Circle();
                break;
            case (1):
                figure = new Triangle();
                break;
            case (2):
                figure = new Square();
                break;
            case (3):
                figure = new Trapeze();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigures.nextInt(4));
        }
        return figure;
    }
}
