package java_MiddleRank.jdbc.test.test_4;



import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        statement_test();
        long end = System.currentTimeMillis();
        System.out.println("statement消耗的时间:" + (end - start));

        start = System.currentTimeMillis();
        preparedstatement_test();
        end = System.currentTimeMillis();
        System.out.println("preparedstatement消耗的时间:" + (end - start));
    }

    public static void statement_test(){
        Statement s = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            s = c.createStatement();
            String sql = "insert into hero values(null,'hero',1,1)";
            for (int i = 1;i <= 10000;i++){
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

    public static void preparedstatement_test(){
        PreparedStatement ps = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            String sql = "insert into hero values (null,?,?,?)";
            ps = c.prepareStatement(sql);
            for (int i = 1;i <= 10000;i++){
                ps.setString(1,"hero");
                ps.setFloat(2,1);
                ps.setInt(3,1);
            }
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
