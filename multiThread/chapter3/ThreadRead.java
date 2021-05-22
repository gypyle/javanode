package chapter3;

import java.io.PipedInputStream;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 20:48
 * @description：
 * @modified By：
 * @version: version$
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream input;

    public ThreadRead(ReadData readData, PipedInputStream input) {
        super();
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run(){
        readData.readMethod(input);
    }
}
