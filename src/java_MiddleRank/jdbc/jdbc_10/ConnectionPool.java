package java_MiddleRank.jdbc.jdbc_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 连接池:
 *      1.连接池在使用之前，就会创建好一定数量的连接。
 *      2.如果有任何线程需要使用连接，那么就从连接池里面借用，而不是自己重新创建.
 *      3.使用完毕后，又把这个连接归还给连接池供下一次或者其他线程使用。
 *      4.倘若发生多线程并发情况，连接池里的连接被借用光了，那么其他线程就会临时等待，直到有连接被归还回来，再继续使用。
 *      5.整个过程，这些连接都不会被关闭，而是不断的被循环使用，从而节约了启动和关闭连接的时间。
 **/
public class ConnectionPool {
    List<Connection> cs = new ArrayList<>();
    int size;//连接池的连接数

    public ConnectionPool(int size){
        this.size = size;
        init();
    }

    //创建连接
    public void init(){
        //连接需要保持不关闭状态，供后续循环使用
        try {
            Class.forName("com.mysql.jdbc.Driver");
            for (int i = 0;i < size;i++){
                Connection c = DriverManager
                        .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
                cs.add(c);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //借用连接
    public synchronized Connection getConnection(){
        //断是否为空，如果是空的就wait等待，否则就借用一条连接出去
        while (cs.isEmpty()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Connection c = cs.remove(0);
        return c;
    }

    //归还连接
    public synchronized void returenConnection(Connection c){
        //在使用完毕后，归还这个连接到连接池，并且在归还完毕后，调用notifyAll，通知那些等待的线程，有新的连接可以借用了
        cs.add(c);
        this.notifyAll();
    }

} 
