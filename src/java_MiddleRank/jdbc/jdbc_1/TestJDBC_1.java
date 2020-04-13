package java_MiddleRank.jdbc.jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1.初始化驱动
 * 2.建立与数据库的连接
 * 3.创建Statement
 * 4.执行sql语句
 * 5.关闭连接
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;

        try {
            /**
             * 驱动类com.mysql.jdbc.Driver
             * 就在 mysql-connector-java-5.0.8-bin.jar中
             */
            Class.forName("com.mysql.jdbc.Driver");

            /**
             * 数据库所处于的ip:127.0.0.1 (本机)
             * 数据库的端口号： 3306 （mysql专用端口号）
             * 数据库名称
             * 编码方式 UTF-8
             * 账号
             * 密码
             */
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/库?characterEncoding=UTF-8","root","密码");

            /**
             * Statement是用于执行SQL语句的
             * 使用java.sql.Statement;
             */
            s = c.createStatement();

            /**
             * sql语句
             */
            String sql = "insert into hero values()";
            s.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //先关闭Statement
            if (s != null){
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //关闭Connection
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
