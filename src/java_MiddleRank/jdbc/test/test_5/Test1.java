package java_MiddleRank.jdbc.test.test_5;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
        list(10,5);
    }

    public static void list(int start,int count){
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            String sql = String.format("select * from hero limit %d,%d",start,count);
            s.execute(sql);
            ResultSet rs = s.getResultSet();
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float hp = rs.getFloat(3);
                int damage = rs.getInt(4);
                System.out.println(id + "\t" + name + "\t" + hp + "\t" + damage);
            }
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
