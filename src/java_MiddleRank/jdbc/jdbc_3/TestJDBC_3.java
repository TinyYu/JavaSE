package java_MiddleRank.jdbc.jdbc_3;

import java.sql.*;

/**
 * 查询总数
 **/
public class TestJDBC_3 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8", "admin", "1999");
            s = c.createStatement();
            String sql = "select count(*) from hero";
            //执行查询语句，并返回结果集给ResultSet
            ResultSet rs = s.executeQuery(sql);
            int total = 0;
            while (rs.next()){
                total = rs.getInt(1);
            }
            System.out.println("表中数据:" + total + "条");
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
