package com.leo.pattern.state.After;

/**
 * @author leijiong
 * @version 1.0
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
