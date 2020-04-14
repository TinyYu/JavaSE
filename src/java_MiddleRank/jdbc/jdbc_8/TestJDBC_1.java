package java_MiddleRank.jdbc.jdbc_8;

import java.sql.*;

/**
 * ORM=Object Relationship Database Mapping
 * 对象和关系数据库的映射
 * 一个对象，对应数据库里的一条记录
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        Hero hero = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            String sql = "select * from hero where id = 150";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                hero = new Hero();
                hero.setId(rs.getInt(1));
                hero.setName(rs.getString(2));
                hero.setHp(rs.getFloat(3));
                hero.setDamage(rs.getInt(4));
            }
            System.out.println(hero);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} 
