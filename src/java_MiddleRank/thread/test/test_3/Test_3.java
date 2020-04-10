package java_MiddleRank.thread.test.test_3;

public class Test_3 {
    public static void main(String[] args) {
        final Hero h1 = new Hero("h1",616,30);
        final Hero h2 = new Hero("h2",616,30);
        final Hero h3 = new Hero("h3",616,30);
        Thread t1 = new Thread(){
            public void run(){
                //t1占有h1
                System.out.println("t1线程占有h1");
                synchronized (h1){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1线程试图占用h2");
                    System.out.println("t1等待中");
                    synchronized (h2){
                        System.out.println("domsomething");
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                //t1占有h1
                System.out.println("t2线程占有h2");
                synchronized (h2){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2线程试图占用h3");
                    System.out.println("t2等待中");
                    synchronized (h3){
                        System.out.println("domsomething");
                    }
                }
            }
        };
        t2.start();
        Thread t3 = new Thread(){
            public void run(){
                //t3占有h3
                System.out.println("t3线程占有h3");
                synchronized (h3){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t3线程试图占用h1");
                    System.out.println("t3等待中");
                    synchronized (h1){
                        System.out.println("domsomething");
                    }
                }
            }
        };
        t3.start();
    }
} 
