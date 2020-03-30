package com.company;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Circle extends Figures {
    Random random = new Random();
    private double radius;
    private double area;

    Circle(){
        radius = getRadius();
    }

    @Override
    String draw() {
        String systemOut = "Фигура круг" + " Площадь " + getArea() + " радиус " + getRadius() + " цвет " + getColor();
        System.out.println(systemOut);
        return systemOut;
    }

    @Override
    double getArea() {
        double area0 = Math.PI * radius * radius;
        area = new BigDecimal(area0).setScale(2, RoundingMode.UP).doubleValue();
        return area;
    }

    @Override
    String getColor() {
        SetColor setColor = new SetColor();
        String colorName = setColor.setColor();
        return colorName;
    }

    double getRadius() {
        double radius0 = random.nextDouble()*10 + 1;
        radius = new BigDecimal(radius0).setScale(1, RoundingMode.UP).doubleValue();
        return radius;
    }

}