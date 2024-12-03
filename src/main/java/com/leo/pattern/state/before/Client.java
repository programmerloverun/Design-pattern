package com.leo.pattern.state.before;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILeft.STOPPING_STATE);
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}
