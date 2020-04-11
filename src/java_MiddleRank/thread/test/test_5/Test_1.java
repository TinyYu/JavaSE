package java_MiddleRank.thread.test.test_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 初始化一个大小是10的线程池
 * 遍历所有文件，当遍历到文件是.java的时候，创建一个查找文件的任务，把这个任务扔进线程池去执行，继续遍历下一个文件
 */
public class Test_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,15,60,
                TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        File file = new File("F:\\exploit\\Trchnology\\Java");
        search(file,"Hero",threadPoolExecutor);
    }

    public static void search(File folder,String search,ThreadPoolExecutor threadPoolExecutor){
        File[] files = folder.listFiles();
        for (File f : files){
            if (f.isDirectory()){
                threadPoolExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        search(f,search,threadPoolExecutor);
                    }
                });
            } else {
                //endsWith()判断是否是指定的后缀结束
                if (f.getName().endsWith("java")) {
                    FileReader fr = null;
                    BufferedReader br = null;
                    try {
                        fr = new FileReader(f);
                        br = new BufferedReader(fr);
                        while (true) {
                            String line = br.readLine();
                            if (line == null)
                                break;
                            if (line.indexOf(search) != -1) {
                                System.out.println(f);
                                break;
                            }
                        }
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
