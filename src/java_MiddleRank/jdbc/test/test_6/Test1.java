package java_MiddleRank.jdbc.test.test_6;

import java.sql.*;

/**
 * 当插入一条数据之后，通过获取自增长id，得到这条数据的id，比如说是55.
 * 删除这条数据的前一条，54.
 * 如果54不存在，则删除53，以此类推直到删除上一条数据。
 */
public class Test1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            String sql = "insert into hero values(null,'hero_max',10000,10000)";
            s.execute(sql);
            ResultSet rs = s.getGeneratedKeys();
            int id = 0;
            if (rs.next()){
                id = rs.getInt(1) - 1;
                delete_1(id,s);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete_1(int id,Statement s){
        String sql_se = String.format("select * from hero where id = %d",id);
        try {
            ResultSet rs_se = s.executeQuery(sql_se);
            String sqldelete = null;
            if (rs_se.next()){
                sqldelete =String.format("delete from hero where id = %d",id);
                s.execute(sqldelete);
            } else {
                id -= 1;
                delete_1(id,s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} 
