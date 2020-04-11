package java_MiddleRank.thread.test.Test_6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_2 {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        Thread t1 = new Thread(){
            public void run(){
                boolean locked = false;
                try {
                    log("线程启动");
                    log("试图占用对象:lock1");
                    lock1.lock();
                    log("占用对象:lock1");
                    log("开始5秒任务");
                    Thread.sleep(5000);
                    log("1秒后，试图占有对象:lock2");
                    locked = lock2.tryLock(1, TimeUnit.SECONDS);
                    if (locked){
                        log("占用对象:lock2");
                        log("开始5秒任务");
                        Thread.sleep(5000);
                    } else {
                        log("占用失败!放弃占用");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象:lock1");
                    lock1.unlock();
                    if (locked){
                        log("释放对象:lock2");
                        lock2.unlock();
                    }
                }
            }
        };
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                boolean locked = false;
                try {
                    log("线程启动");
                    log("试图占用对象:lock2");
                    lock2.lock();
                    log("占用对象:lock2");
                    log("开始5秒任务");
                    Thread.sleep(5000);
                    log("1秒后，试图占有对象:lock1");
                    locked = lock1.tryLock(1, TimeUnit.SECONDS);
                    if (locked){
                        log("占用对象:lock1");
                        log("开始5秒任务");
                        Thread.sleep(5000);
                    } else {
                        log("占用失败!放弃占用");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象:lock2");
                    lock2.unlock();
                    if (locked){
                        log("释放对象:lock1");
                        lock1.unlock();
                    }
                }
            }
        };
        t2.setName("t2");
        t2.start();
    }

    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void log(String msg){
        System.out.printf("%s %s %s \n",now(),Thread.currentThread().getName(),msg);
    }
}
