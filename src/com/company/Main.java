package com.company;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randQuantity = random.nextInt(100);
        Figure figure[] = new Figure[randQuantity];
        for (int i = 0; i <figure.length; i++){
            figure[i] = RandomFigures.randomFigures();
            figure[i].draw();
        }
    }
}
