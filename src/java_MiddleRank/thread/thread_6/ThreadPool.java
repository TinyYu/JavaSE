package java_MiddleRank.thread.thread_6;

import java.util.LinkedList;

/**
 * 自定义线程池
 **/
public class ThreadPool {
    //线程池大小
    int threadPoolSize;

    //任务容器
    LinkedList<Runnable> tasks = new LinkedList<>();

    public void add(Runnable r){
        synchronized (tasks){
            tasks.add(r);
            //唤醒等待任务的消费者
            tasks.notifyAll();
        }
    }

    class TaskConsumeThread extends Thread{
        public TaskConsumeThread(String name){
            super(name);
        }

        Runnable task;

        public void run(){
            System.out.println("启动:" + this.getName());
            while (true){
                synchronized (tasks){
                    while (tasks.isEmpty()){
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = tasks.removeLast();
                    //允许添加任务的线程可以继续添加任务
                    tasks.notifyAll();
                }
                System.out.println(this.getName() + "获取任务，并执行");
                task.run();
            }
        }
    }
    //试图消费任务的线程
    public ThreadPool(){
        //10个消费任务
        threadPoolSize = 10;
        synchronized (tasks){
            for (int i = 0;i < threadPoolSize;i++){
                new TaskConsumeThread("任务消费者线程 " + i).start();
            }
        }
    }


} 
