package java_MiddleRank.jdbc.jdbc_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用事务:
 *      要么都成功，要么都失败
 **/
public class TestJDBC_2 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();

            //开始事务
            //取消自动提交
            c.setAutoCommit(false);
            String sql1 = "update hero set hp = hp + 1 where name = 'hero_max'";
            s.execute(sql1);//加血成功
            String sql2 = "updata hero set hp = hp - 1 where name = 'hero_max'";
            s.execute(sql2);//减血失败
            //手动提交
            c.commit();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
