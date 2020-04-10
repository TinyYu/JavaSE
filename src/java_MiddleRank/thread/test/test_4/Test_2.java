package java_MiddleRank.thread.test.test_4;

public class Test_2 {
    public static void main(String[] args) {
        Hero h1 = new Hero("h1",1000);
        //加血2个
        Thread[] recover_thread = new Thread[2];
        //减血5个
        Thread[] hurt_thread = new Thread[5];

        for (int i = 0;i < recover_thread.length;i++) {
            Thread t1 = new Thread() {
                public void run() {
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
            t1.start();
            recover_thread[i] = t1;
        }

        for (int i = 0;i < hurt_thread.length;i++) {
            Thread t2 = new Thread() {
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
            t2.start();
            hurt_thread[i] = t2;
        }

        for (Thread thread : recover_thread){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread thread : hurt_thread){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} 
