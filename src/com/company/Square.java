package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Square extends Figure {
    Random random = new Random();
    private double diagonal;
    private double area;
    private double a;

    Square(){
        a = random.nextDouble()*10 + 1;
        diagonal = getDiagonal();
    }

    @Override
    String draw() {
        String systemOut = "Фигура квадрат "+ " Площадь " + getArea() + " диагональ " + diagonal
                + " цвет " + getColor();
        System.out.println(systemOut);
        return systemOut;
    }

    @Override
    double getArea() {
        double area0 = a * a;
        area = new BigDecimal(area0).setScale(1, RoundingMode.UP).doubleValue();
        return area;
    }

    @Override
    String getColor() {
        SetColor setColor = new SetColor();
        String colorName = setColor.setColor();
        return colorName;
    }

    double getDiagonal() {
        double diagonal0 = random.nextDouble()*10 + 1;
        diagonal = new BigDecimal(diagonal0).setScale(1, RoundingMode.UP).doubleValue();
        return diagonal;
    }


}