package chapter4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-05-15 22:13
 * @description：
 * @modified By：
 * @version: version$
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void serviceMethodA(){
        lock.lock();
//        System.out.println(lock.getHoldCount());
        serviceMethodB();
        lock.unlock();
    }

    public void serviceMethodB(){
        lock.lock();
        System.out.println(lock.getHoldCount());
        System.out.println(lock.getQueueLength());
//        lock.getWaitQueueLength(condition)
        lock.unlock();
    }


    public static void main(String[] args) {
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("2222");
            }
        },new Date());
        Service service1 = new Service();

        service1.serviceMethodA();
        service1.serviceMethodB();
    }
}
