package com.leo.principles.p2_RichterSubstitutionPrinciple.before;

/**
 * @author leijiong
 * @version 1.0
 */
public class RectangleDemo {
    public  static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " height:" + rectangle.getLength());
        }

    }





}
