package com.leo.pattern.decorator;

/**
 * @author leijiong
 * @version 1.0
 */public abstract class FastFood {
     private float price;
     private String desc;


    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    /**
     * 获取
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 获取
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();  //获取价格
}
