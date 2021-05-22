package chapter3;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-27 22:17
 * @description：
 * @modified By：
 * @version: version$
 */
public class DBTools {
    private boolean flag = false;
    synchronized public void getA(){
        while (flag == true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("AAA");
        flag = true;
        notifyAll();
    }

    synchronized public void getB(){
        while (flag == false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BBB");
        flag = false;
        notifyAll();
    }
}
