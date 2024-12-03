package com.leo.principles.p2_RichterSubstitutionPrinciple.before;

/**
 * @author leijiong
 * @version 1.0
 */
public class Square extends Rectangle{

    public void setWidth(double width)
    {
        super.setLength(width);
        super.setWidth(width);
    }

    public void setLength(double length)
    {
        super.setLength(length);
        super.setWidth(length);
    }
}
