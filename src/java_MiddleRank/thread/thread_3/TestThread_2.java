package java_MiddleRank.thread.thread_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * synchronized同步对象
 **/
public class TestThread_2 {
    public static void main(String[] args) {
        final  Object sombObject = new Object();
        Thread t1 = new Thread(){
            public void run(){
                try {
                        System.out.println(now() + ":" +"t1线程启动");
                        System.out.println(now()+ ":" + this.getName() + "试图占有对象：someObject");
                        synchronized (sombObject) {
                        System.out.println(now() + ":" + this.getName() + "占有对象:someObject");
                        Thread.sleep(1000);
                        System.out.println(now() + ":" + this.getName() + "释放对象:someObject");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(now() + ":" + "t1线程结束");
            }
        };
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                try {
                    System.out.println(now() + ":" +"t2线程启动");
                    System.out.println(now()+ ":" + this.getName() + "试图占有对象：someObject");
                    /**
                     * synchronized表示当前线程，独占 对象 someObject
                     *   当前线程独占 了对象someObject，如果有其他线程试图占有对象someObject，就会等待，
                     *   直到当前线程释放对someObject的占用。
                     */
                    synchronized (sombObject) {
                        System.out.println(now() + ":" + this.getName() + "占有对象:someObject");
                        Thread.sleep(1000);
                        System.out.println(now() + ":" + this.getName() + "释放对象:someObject");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(now() + ":" + "t2线程结束");
            }
        };
        t2.setName("t2");
        t2.start();
    }

    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
} 
