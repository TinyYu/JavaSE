package java_MiddleRank.jdbc.jdbc_3;

import java.sql.*;

/**
 * sql语句判断用户名密码是否正确
 **/
public class TestJDBC_2 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/库?characterEncoding=UTF-8", "root", "密码");
            s = c.createStatement();
            String name = "admin";
            String password = "1";
            String sql = "select * from 表 where " +
                    "name = '"+ name +"' and password = '" + password +"'";
            //执行查询语句，并返回结果集给ResultSet
            ResultSet rs = s.executeQuery(sql);

            /**
             * 如果有数据，就表明密码正确了，
             * 如果没数据，就表明密码错误。
             */
            if (rs.next()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            rs.close();
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
