package com.leo.principles.p2_RichterSubstitutionPrinciple.after;

/**
 * @author leijiong
 * @version 1.0
 */
public class Square implements Quadrilateral{

   private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return this.side;
    }

    @Override
    public double getWidth() {
        return this.side;
    }
}
