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
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/库?characterEncoding=UTF-8","root","密码");
            s = c.createStatement();
            //增
            String sql_create = "insert into 表 values()";
            //删
            String sql_delete = "delete from 表 where 条件";
            //改
            String sql_update = "update 表 set 列 = '值' where 条件";
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
