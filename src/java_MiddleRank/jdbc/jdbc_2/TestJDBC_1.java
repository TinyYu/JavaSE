package java_MiddleRank.jdbc.jdbc_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 增删改
 * C 增加(Create)
 * R 读取查询(Retrieve)
 * U 更新(Update)
 * D 删除(Delete)
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            //增
            String sql_create = "insert into hero values(null ,'hero2',500,60)";
            //删
            String sql_delete = "delete from hero where hp = 616";
            //改
            String sql_update = "update hero set damage = 61 where name = 'hero2'";
            s.execute(sql_create);
            s.execute(sql_delete);
            s.execute(sql_update);
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
