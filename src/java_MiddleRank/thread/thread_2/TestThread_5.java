package java_MiddleRank.thread.thread_2;

/**
 * 守护线程
 * 当一个进程里，所有的线程都是守护线程的时候，结束当前进程。
 * 守护线程通常会被用来做日志，性能统计等工作。
 **/
public class TestThread_5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                int seconds = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("已经开始%d秒\n",seconds++);
            }
        };
        t1.setDaemon(true);
        t1.start();
    }
} 
