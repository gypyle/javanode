package chapter1;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-20 21:05
 * @description：
 * @modified By：
 * @version: version$
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread");
    }
}
