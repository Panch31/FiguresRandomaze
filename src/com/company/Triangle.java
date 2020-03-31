package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Triangle extends Figure {
    Random random = new Random();
    private double hypotenuse;
    private double a;
    private double b;

    Triangle(){
        double a1 = random.nextDouble()*10 + 1;
        a = new BigDecimal(a1).setScale(2, RoundingMode.UP).doubleValue();
        double b1 = random.nextDouble()*10 + 1;
        b = new BigDecimal(b1).setScale(2, RoundingMode.UP).doubleValue();
        hypotenuse = getHypotenuse();
    }

    @Override
    String draw() {
        String systemOut = "Фигура треугольник" + " Площадь " + getArea() + " гипотенуза " + hypotenuse +
                " цвет " + getColor();
        System.out.println(systemOut);
        return systemOut;
    }

    @Override
    double getArea() {
        double b1 = a>b ? Math.sqrt(hypotenuse*hypotenuse - b*b) : Math.sqrt(hypotenuse*hypotenuse - a*a);
        double area1 = a>b ? (b * b1)/2 : (a * b1)/2;
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
        hypotenuse = a > b ? a : b;
        return hypotenuse;
    }

}