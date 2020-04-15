package java_MiddleRank.jdbc.test.test_9;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1. 使用传统方式创建100个线程，每个线程都会创建新的连接，通过这个连接向数据库插入1条数据，然后关闭这个连接。
 *
 * 2. 使用数据库连接池的方式，创建一个有10条连接的连接池，然后创建100个线程，
 *    每个线程都会向连接池借用连接，借用到后，向数据库插入1条数据，然后归还这个连接。
 **/
public class Test1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        one();
        long end = System.currentTimeMillis();
        System.out.println("传统方式:" + (end - start));

        start = System.currentTimeMillis();
        tow();
        end = System.currentTimeMillis();
        System.out.println("连接池方式:" + (end - start));
    }

    public Test1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection_test1() throws SQLException {
        return DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");

    }
    public static void one(){
        Test1 test1 = new Test1();
        Thread[] threads = new Thread[100];
        for (int i = 0;i < threads.length;i++){
            Thread t = new Thread(){
                public void run(){
                    Connection c = null;
                    Statement s = null;
                    try {
                        c = test1.getConnection_test1();
                        s = c.createStatement();
                        String sql = "insert into hero values(null ,'ct',1,1)";
                        s.execute(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        if (s != null){
                            try {
                                s.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if (c != null){
                            try {
                                c.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            };
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

    public static void tow(){
        ConnectionPool connectionPool = new ConnectionPool(10);
        Thread[] threads = new Thread[100];
        for (int i = 0;i < threads.length;i++){
            Thread t = new Thread(){
                public void run(){
                    Connection c = connectionPool.getConnection();
                    Statement s = null;
                    try {
                        s = c.createStatement();
                        String sql = "insert into hero values(null ,'ljc',2,2)";
                        s.execute(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        if (s != null){
                            try {
                                s.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    connectionPool.returenConnection(c);
                }
            };
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
