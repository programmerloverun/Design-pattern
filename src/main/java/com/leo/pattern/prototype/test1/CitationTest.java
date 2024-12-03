package com.leo.pattern.prototype.test1;

import java.io.*;

//测试类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\citation.txt"));
        oos.writeObject(c1);
        oos.close();

        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\citation.txt"));
        Citation c2 = (Citation) ois.readObject();
        c2.getStu().setName("李四");

        // 判断是否是同一个对象
        System.out.println(c1 == c2);

        c1.show();
        c2.show();
    }
}