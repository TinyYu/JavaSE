package java_MiddleRank.jdbc.jdbc_4;

import java.sql.*;

/**
 * 使用PreparedStatement
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        PreparedStatement ps = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8", "admin", "1999");
            String sql = "insert into hero values(null ,?,?,?)";

            /**
             * 如果PreparedStatement 执行10次，只需要1次把SQL语句传输到数据库端
             * 数据库对带?的SQL进行预编译
             * 每次执行，只需要传输参数到数据库端
             *   1. 网络传输量比Statement更小
             *   2. 数据库不需要再进行编译，响应更快
             */
            //根据sql语句创建PreparedStatement
            ps = c.prepareStatement(sql);
            //设置参数
            ps.setString(1,"hero1");//第一个问号
            ps.setFloat(2,3.0f);
            ps.setInt(3,1);
            //执行
            ps.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null){
                try {
                    ps.close();
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
