package java_MiddleRank.thread.thread_1;

/**
 * 创建多线程
 */
public class TestThread_2 {
    public static void main(String[] args) {
        Hero h1 = new Hero("盖伦",616,50);
        Hero h2 = new Hero("提莫",300,30);
        Hero h3 = new Hero("男枪",616,50);
        Hero h4 = new Hero("女枪",300,30);

        KillThread killThread1 = new KillThread(h1,h2);
        //启动线程办法： 实例化一个KillThread对象，并且调用其start方法
        killThread1.start();
        KillThread killThread2 = new KillThread(h3,h4);
        killThread2.start();
    }
}
