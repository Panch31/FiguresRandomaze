package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Triangle extends Figures {
    Random random = new Random();
    private double hypotenuse;
    private double a;

    Triangle(){
        double a1 = random.nextDouble()*10 + 1;
        a = new BigDecimal(a1).setScale(2, RoundingMode.UP).doubleValue();
        hypotenuse = getHypotenuse();
    }

    @Override
    String draw() {
        String systemOut = "Фигура триугольник" + " Площадь " + getArea() + " гипотенуза " + getHypotenuse() +
                " цвет " + getColor();
        System.out.println(systemOut);
        return systemOut;
    }

    @Override
    double getArea() {
        double b = Math.sqrt(hypotenuse*hypotenuse - a*a);
        double area1 = (a * b) / 2;
        double area = new BigDecimal(area1).setScale(2, RoundingMode.UP).doubleValue();
        return area;
    }

    @Override
    String getColor() {
        SetColor setColor = new SetColor();
        String colorName = setColor.setColor();
        return colorName;
    }

    double getHypotenuse() {
        double hypotenuse0 = a + random.nextDouble()*10 + 1;
        hypotenuse = new BigDecimal(hypotenuse0).setScale(1, RoundingMode.UP).doubleValue();
        return hypotenuse;
    }

}