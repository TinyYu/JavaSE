package java_MiddleRank.thread.thread_8;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread_1 {
    private static int value = 0;
    private static AtomicInteger atomicI = new AtomicInteger();
    public static void main(String[] args) {
        int number = 100000;
        Thread[] ts1 = new Thread[number];

        for (int i = 0;i < ts1.length;i++){
            Thread t = new Thread(){
                public void run(){
                    value++;
                }
            };
            t.start();
            ts1[i] = t;
        }

        //等待这些线程结束
        for (Thread t : ts1){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("%d个线程进行value++后，value的值变成:%d\n",number,value);


        Thread[] ts2 = new Thread[number];
        for (int i = 0;i < ts2.length;i++){
            Thread t = new Thread(){
                public void run(){
                    //原子性自增
                    atomicI.incrementAndGet();
                }
            };
            t.start();
            ts2[i] = t;
        }

        //等待这些线程结束
        for (Thread t : ts2){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%d个线程进行atomicI.incrementAndGet();后，atomicI的值变成:%d%n", number,atomicI.intValue());
    }
}
