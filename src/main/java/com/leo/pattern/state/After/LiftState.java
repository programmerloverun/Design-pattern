package com.leo.pattern.state.After;

/**
 * @author leijiong
 * @version 1.0
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();

    public abstract void run();


}
