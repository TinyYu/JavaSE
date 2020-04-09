package java_MiddleRank.thread.thread_1;

/**
 * 实现Runnable接口
 * Battle继承Runnable
 **/
public class TestThread_3 {
    public static void main(String[] args) {
        Hero h1 = new Hero("hero1",616,30);
        Hero h2 = new Hero("hero2",516,40);
        Hero h3 = new Hero("hero3",416,50);
        Hero h4 = new Hero("hero4",716,20);

        /**
         * battle1，battle2对象实现了Runnable接口，但是直接调用run方法不会启动线程
         * 需要借助一个线程对象的start方法
         * 启动线程是start()方法，run()并不能启动一个新的线程
         */
        Battle battle1 = new Battle(h1,h2);
        new Thread(battle1).start();

        Battle battle2 = new Battle(h3,h4);
        new Thread(battle2).start();
    }
} 
