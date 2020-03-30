package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Trapeze extends Figures {
    Random random = new Random();
    private double height;
    private double a;
    private double b;

    Trapeze(){
        double a0 = random.nextDouble()*10 + 1;
        this.a = new BigDecimal(a0).setScale(1, RoundingMode.UP).doubleValue();
        double b0 = random.nextDouble()*10;
        this.b = new BigDecimal(b0).setScale(1, RoundingMode.UP).doubleValue();
        height = getHeight();
    }

    @Override
    String draw() {
        String systemOut = "Фигура трапеция"+ " Площадь " + getArea() + " высота " + getHeight() + " цвет " + getColor();
        System.out.println(systemOut);
        return systemOut;
    }

    @Override
    double getArea() {
        double area0 = ((a * b) / 2) * height;
        double area = new BigDecimal(area0).setScale(1, RoundingMode.UP).doubleValue();
        return area;
    }

    @Override
    String getColor(){
        SetColor setColor = new SetColor();
        String colorName = setColor.setColor();
        return colorName;
    }

    double getHeight() {
        double height0 = random.nextDouble()*10 +1;
        height = new BigDecimal(height0).setScale(1, RoundingMode.UP).doubleValue();
        return height;
    }

}

