package java_MiddleRank.thread.thread_2;

/**
 * 加入到当前线程中
 **/
public class TestThread_2 {
    //所有进程，至少会有一个线程即主线程，即main方法开始执行，就会有一个看不见的主线程存在。
    public static void main(String[] args) {
        Hero h1 = new Hero("hero1",616,30);
        Hero h2 = new Hero("hero2",516,40);
        Hero h3 = new Hero("hero3",416,50);
        Hero h4 = new Hero("hero4",716,20);
        Thread t1 = new Thread(){
            public void run(){
                while(!h1.isDead()){
                    h2.attackHero(h1);
                }
            }
        };
        t1.start();

        //到此一直都是main进程在运行
        try {
            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(){
            public void run(){
                while (!h3.isDead()){
                    h4.attackHero(h3);
                }
            }
        };
        //当hero1的hp为0或负数时，才会开始运行t2线程
        t2.start();
    }
} 
