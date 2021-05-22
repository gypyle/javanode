package chapter1;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * @author ：guoyanpei
 * @date ：Created in 2021-04-20 21:02
 * @description：
 * @modified By：
 * @version: version$
 */
public class Demo1 {
    //线程运行的顺序和代码的顺序无关
    //多次调用线程会报错
    //Thread类也实现了Runnable接口,作用是可以将线程对象中的run()方法交由其他线程调用
    //currentThread()是获取当前的线程信息
    //isAlive()是判断当前线程是否正在运行或者处于运行的状态,是为true 否者为false
    // sleep()是使正在执行的线程休眠
    //getId()是获取线程的唯一标识
    /*停止线程
    stop()废弃的方法,问题1:线程的 一些清理性工作不能完成;问题2:会对锁定的对象进行解锁,存在数据同步问题;
    interrupt()打一个停止标记,但是线程不是真正的停止了
    interrupted()--当前线程--是否停止,会置状态false
    isInterruped()--线程对象--是否停止,不改变状态
    使用异常法来停止线程
    可以在睡眠中停止线程,线程会直接进入catch(异常捕获)
    return法停止线程(也不建议使用,捕获不了异常信息)
    suspend()和resume()方法缺点:1/独占 2/数据不同步
    yield()放弃当前的cpu资源
    setPriority()可以设置线程的优先级,优先级具有继承性,,但是与执行顺序无关,只是让cpu尽量先执行
    守护线程setDeamon(),当无线程运行时不执行
    */
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
//        myThread.start();
        myThread.start();
        System.out.println("over");
        System.out.println(currentThread().getName());
        myThread.isAlive();
        sleep(1000);
        currentThread().interrupt();
//        myThread.isInterrupted();
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
    }

}
