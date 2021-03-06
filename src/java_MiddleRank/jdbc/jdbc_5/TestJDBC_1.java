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
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8", "admin", "1999");
            s = c.createStatement();
            String sqlInsert = "insert into hero values(null,'hero3',509,70)";
            String sqlDelete = "delete from hero where name = 'hero2'";
            String sqlUpdate = "update hero set hp=519 where name = 'hero1'";

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
