package java_MiddleRank.thread.thread_6;

public class TestThread_2 {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
        int sleep = 1000;
        while (true){
            threadPool.add(new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            try {
                Thread.sleep(sleep);
                sleep = sleep > 100 ? sleep - 100 : sleep;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
