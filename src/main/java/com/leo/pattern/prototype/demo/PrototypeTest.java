package com.leo.pattern.prototype.demo;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();

        // 这属于哪种拷贝？
        // 浅拷贝
        // 为什么属于浅拷贝？
        // 因为引用类型是浅拷贝，所以r1和r2指向的是同一个对象，所以是同一个对象
        // 为什么输出结果是false？
        // 因为r1和r2指向的是同一个对象，所以r1和r2的引用类型属性也是同一个对象

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
        // 输出结果： 对象r1和r2是同一个对象？false
    }
}