package com.leo.pattern.state.before;

/**
 * @author leijiong
 * @version 1.0
 */
public interface ILeft {

    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();

    void close();

    void stop();

    void run();
}
