package java_MiddleRank.thread.thread_4;

/**
 * 死锁
 **/
public class TestThread_1 {
    public static void main(String[] args) {
        final Hero h1 = new Hero("h1",616,30);
        final Hero h2 = new Hero("h2",616,30);

        /**
         * 1. 线程1 首先占有对象1，接着试图占有对象2
         * 2. 线程2 首先占有对象2，接着试图占有对象1
         * 3. 线程1 等待线程2释放对象2
         * 4. 与此同时，线程2等待线程1释放对象1
         */
        Thread t1 = new Thread(){
            public void run(){
                synchronized (h1){
                    System.out.println("t1线程占有h1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1试图占用h2");
                    System.out.println("t1等待中......");
                    synchronized (h2){
                        System.out.println("dosomething");
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                synchronized (h2) {
                    System.out.println("t2线程占有h2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2试图占用h1");
                    System.out.println("t1等待中......");
                    synchronized (h1){
                        System.out.println("dosomething");
                    }
                }
            }
        };
        t2.start();
    }
}
