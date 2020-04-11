package java_MiddleRank.thread.thread_6;

public class TestThread_1 {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
        for (int i = 0;i < 5;i++){
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务");
                }
            };
            threadPool.add(task);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
