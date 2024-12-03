package com.leo.principles.p2_RichterSubstitutionPrinciple.after;

/**
 * @author leijiong
 * @version 1.0
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
