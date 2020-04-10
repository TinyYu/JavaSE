package java_MiddleRank.thread.thread_3;

/**
 * 使用hero对象作为同步对象
 **/
public class TestThread_4 {
    public static void main(String[] args) {
        final Hero h1 = new Hero("h1",1000,30);
        int n =1000;
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThread = new Thread[n];
        for (int i = 0;i < n;i++) {
            Thread t1 = new Thread() {
                public void run() {
                    ////使用h1作为synchronized
                    synchronized (h1){
                        h1.recover();//增加
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t1.start();
            addThreads[i] = t1;
        }

        for (int i = 0;i < n;i++) {
            Thread t2 = new Thread() {
                public void run() {
                    //在方法hurt中有synchronized(this)
                    h1.hurt();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t2.start();
            reduceThread[i] = t2;
        }

        for (Thread t1 : addThreads){
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread t2 : reduceThread){
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,h1.getHp());
    }
} 
