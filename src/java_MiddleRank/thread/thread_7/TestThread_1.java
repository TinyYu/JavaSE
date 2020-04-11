package java_MiddleRank.thread.thread_7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock同步对象
 */
public class TestThread_1 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(){
            public void run(){

                try {
                    log("线程启动");
                    log("试图占有对象:lock");
                    lock.lock();
                    log("占有对象:lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象:lock");
                    lock.unlock();
                }
                log("线程结束");
            }
        };
        t1.setName("t1");
        t1.start();

        try {
            //先让t1运行2秒
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(){
            public void run(){
                try {
                    log("线程启动");
                    log("试图占有对象:lock");
                    //synchronized (someObject) 类似的，lock()方法，表示当前线程占用lock对象，一旦占用，其他线程就不能占用了。
                    lock.lock();
                    log("占有对象:lock");
                    log("进行5秒业务操作");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象:lock");
                    //synchronized 不同的是，一旦synchronized 块结束，就会自动释放对someObject的占用。
                    //lock却必须调用unlock方法进行手动释放，为了保证释放的执行，往往会把unlock() 放在finally中进行
                    lock.unlock();
                }
                log("线程结束");
            }
        };
        t2.setName("t2");
        t2.start();
    }

    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void log(String msg){
        /**
         * Thread.currentThread()可以获取当前线程的引用
         *    getId();获取该线程的标识符
         * 　　getName();获取该线程名称
         * 　　getState();获取线程状态
         * 　　boolean isAlive();测试线程是否属于活动状态
         * 　　boolean isDaemon();测试线程是否为守护线程
         * 　　boolean isInterrupted();测试线程是否已经中断
         */
        System.out.printf("%s %s %s \n",now(),Thread.currentThread().getName(),msg);
    }
}
