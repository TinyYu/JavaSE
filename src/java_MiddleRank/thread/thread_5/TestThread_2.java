package java_MiddleRank.thread.thread_5;


/**
 * 使用wait和notify进行线程交互
 **/
public class TestThread_2 {
    public static void main(String[] args) {
        Hero_1 h1 = new Hero_1("h1",616);
        Thread t1 = new Thread(){
            public void run() {
                while (true) {//无需循环判断
                    h1.hurt();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run() {
                while (true) {
                    h1.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }
} 
