package java_MiddleRank.jdbc.jdbc_6;

import java.sql.*;

/**
 * 获取自增长id
 * 在Statement通过execute或者executeUpdate执行完插入语句后，MySQL会为新插入的数据分配一个自增长id，
 * (前提是这个表的id设置为了自增长,在Mysql创建表的时候，AUTO_INCREMENT就表示自增长)
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        PreparedStatement ps = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","密码");
            String sql = "insert into 表 values(?,?,?)";

            //Statement.RETURN_GENERATED_KEYS参数，以确保会返回自增长ID
            ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,"hero");
            ps.setFloat(2,0.30f);
            ps.setInt(3,100);
            ps.execute();

            //在执行完插入语句后,MySql会为新插入的数据分配一个自增id
            //JDBC通过getGeneratedKeys获取该id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                int id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} 
