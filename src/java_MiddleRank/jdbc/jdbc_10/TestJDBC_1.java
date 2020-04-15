package java_MiddleRank.jdbc.jdbc_10;

import java.sql.Connection;

public class TestJDBC_1 {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(3);
        Thread[] threads = new Thread[100];
        for (int i = 0;i < threads.length;i++){
            Thread t = new Thread(){
                public void run(){
                    Connection c = null;
                    try {
                        c = connectionPool.getConnection();
                        System.out.println(this.getName() + "获取一根连接，并开始1秒工作");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    connectionPool.returenConnection(c);
                }
            };
            t.setName("working thread" + i + "\t");
            t.start();
            threads[i] = t;
        }

        for (Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
