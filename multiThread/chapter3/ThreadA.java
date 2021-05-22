package chapter3;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 22:21
 * @description：
 * @modified By：
 * @version: version$
 */
public class ThreadA extends Thread {
    private DBTools dbTools;

    public ThreadA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run(){
        dbTools.getA();
    }
}
