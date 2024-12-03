package com.leo.principles.p2_RichterSubstitutionPrinciple.after;

/**
 * @author leijiong
 * @version 1.0
 */
public class RectangleDemo {

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽的操作
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
        printLengthAndWidth(rectangle);
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);

    }





}
