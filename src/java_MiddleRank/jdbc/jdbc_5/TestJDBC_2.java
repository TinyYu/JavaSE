package java_MiddleRank.jdbc.jdbc_5;

import java.sql.*;

/**
 * 不同点
 *  不同1：
 *      execute可以执行查询语句
 *      然后通过getResultSet，把结果集取出来
 *      executeUpdate不能执行查询语句
 *  不同2:
 *      execute返回boolean类型，true表示执行的是查询语句，false表示执行的是insert,delete,update等等
 *      executeUpdate返回的是int，表示有多少条数据受到了影响
 **/
public class TestJDBC_2 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/库?characterEncoding=UTF-8", "root", "密码");
            s = c.createStatement();
            String sql = "select * from 表";

            //execute可以执行查询语句，通过getResultSet,取出结果集
            s.execute(sql);
            ResultSet rs = s.getResultSet();
            while (rs.next()){
                System.out.println(rs.getInt("id"));
            }

            //executeUpdate不能执行查询语句
            s.executeUpdate(sql);

            //execute返回boolean类型,true表示查询语句，false表示增删改
            boolean b = s.execute(sql);
            System.out.println(b);
            //executeUpdate返回int，表示有多少条数据受到影响
            String sqlUpdate = "update 表 set 列=值 where 条件";
            int number = s.executeUpdate(sqlUpdate);
            System.out.println(number);
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
