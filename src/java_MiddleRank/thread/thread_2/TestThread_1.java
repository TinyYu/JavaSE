package java_MiddleRank.thread.thread_2;

/**
 * 暂停线程
 **/
public class TestThread_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                int seconds = 0;
                while (true){
                    try {
                        //表示当前线程暂停1000毫秒 ，其他线程不受影响
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经开始%d秒\n",seconds++);
                }
            }
        };
        t1.start();
    }
} 
