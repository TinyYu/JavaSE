package java_MiddleRank.jdbc.test.test_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 向数据库中插入100条数据
 **/
public class Test1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            for (int i = 1;i <= 100;i++){
                String name = "hero" + i;
                float hp = i * 100;
                int damage = i * 50;
                String sql = String.format("insert into hero values(null,'%s','%f','%d')",name,hp,damage);
                s.execute(sql);
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
