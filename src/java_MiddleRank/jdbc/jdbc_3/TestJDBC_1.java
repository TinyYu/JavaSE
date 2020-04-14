package java_MiddleRank.jdbc.jdbc_3;

import java.sql.*;

/**
 * 查询
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8", "admin", "1999");
            s = c.createStatement();
            String sql = "select * from hero";
            //执行查询语句，并返回结果集给ResultSet
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");//使用字段名
                String name = rs.getString(2);//使用字段顺序
                float hp = rs.getFloat("hp");
                int damage = rs.getInt("damage");
                System.out.printf("%d\t%s\t%f\t%d\n",id,name,hp,damage);
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
