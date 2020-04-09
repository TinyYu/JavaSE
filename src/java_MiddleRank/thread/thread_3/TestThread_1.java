package java_MiddleRank.thread.thread_3;

/**
 * 演示同步问题
 **/
public class TestThread_1 {
    public static void main(String[] args) {
        final Hero h1 = new Hero("h1",10000,30);

        //线程数
        int n = 10000;
        Thread[] addThreads = new Thread[n];//回血
        Thread[] reduceThreds = new Thread[n];//掉血

        //回血
        for (int i = 0;i < n;i++){
            Thread t = new Thread(){
                public void run(){
                    h1.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
        }

        //掉血
        for (int i = 0;i < n;i++){
            Thread t = new Thread(){
                public void run(){
                    h1.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreds[i] = t;
        }

        //等待回血线程结束
        for (Thread t : addThreads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //等待掉血线程结束
        for (Thread t : reduceThreds){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /**
         * 脏数据
         * 1. 假设增加线程先进入，得到的hp是10000
         * 2. 进行增加运算
         * 3. 正在做增加运算的时候，还没有来得及修改hp的值，减少线程来了
         * 4. 减少线程得到的hp的值也是10000
         * 5. 减少线程进行减少运算
         * 6. 增加线程运算结束，得到值10001，并把这个值赋予hp
         * 7. 减少线程也运算结束，得到值9999，并把这个值赋予hp
         *    hp，最后的值就是9999或者其他数据
         */
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %.0f%n", n,n,h1.getHp());
    }
} 
