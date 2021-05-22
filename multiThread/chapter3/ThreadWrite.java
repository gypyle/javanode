package chapter3;

import java.io.PipedOutputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 20:45
 * @description：
 * @modified By：
 * @version: version$
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    public void run(){
        write.writeMethod(out);
    }

}
