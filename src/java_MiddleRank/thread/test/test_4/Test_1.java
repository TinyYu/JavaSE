package java_MiddleRank.thread.test.test_4;

public class Test_1 {
    public static void main(String[] args) {
        Hero h1 = new Hero("h1",1000);
        Thread t1 = new Thread(){
            public void run() {
                while (true) {
                    h1.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while (true) {
                    h1.recover();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }
}
