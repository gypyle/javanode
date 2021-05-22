package chapter3;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 22:23
 * @description：
 * @modified By：
 * @version: version$
 */
public class TestNotify {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            ThreadA threadA = new ThreadA(dbTools);
            threadA.start();
            ThreadB threadB = new ThreadB(dbTools);
            threadB.start();
        }
    }
}
