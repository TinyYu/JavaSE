package java_MiddleRank.jdbc.jdbc_5;

import java.sql.*;

/**
 * execute与executeUpdate的相同点
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/库?characterEncoding=UTF-8", "root", "密码");
            s = c.createStatement();
            String sqlInsert = "insert into 表 values()";
            String sqlDelete = "delete from 表 where 条件";
            String sqlUpdate = "update 表 set 列=值 where 条件";

            //都可以执行增删改
            s.execute(sqlInsert);
            s.execute(sqlUpdate);
            s.execute(sqlDelete);
            s.executeUpdate(sqlInsert);
            s.executeUpdate(sqlUpdate);
            s.executeUpdate(sqlDelete);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
} 
