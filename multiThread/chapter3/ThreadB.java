package chapter3;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 22:22
 * @description：
 * @modified By：
 * @version: version$
 */
public class ThreadB extends Thread {
    private DBTools dbTools;

    public ThreadB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run(){
        dbTools.getB();
    }
}
