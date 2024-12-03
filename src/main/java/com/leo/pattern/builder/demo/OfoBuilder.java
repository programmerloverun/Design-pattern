package com.leo.pattern.builder.demo;

//ofo单车Builder类
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        myBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        myBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return myBike;
    }
}