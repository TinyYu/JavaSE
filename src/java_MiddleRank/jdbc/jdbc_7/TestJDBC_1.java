package java_MiddleRank.jdbc.jdbc_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 不使用事务
 **/
public class TestJDBC_1 {
    public static void main(String[] args) {
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            //假设业务操作是：加血，减血各做一次,结束后，英雄的血量不变
            String sql1 = "update hero set hp = hp + 1 where name = 'hero_max'";
            s.execute(sql1);//加血成功
            String sql2 = "updata hero set hp = hp - 1 where name = 'hero_max'";
            s.execute(sql2);//减血失败
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} 
