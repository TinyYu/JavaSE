package java_MiddleRank.jdbc.test.test_7;

import java.sql.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        PreparedStatement ps = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
            String sql = "select id from hero limit ?,?";
            ps = c.prepareStatement(sql);
            ps.setInt(1,0);
            ps.setInt(2,10);
            ResultSet rs = ps.executeQuery();

            //开始事务
            c.setAutoCommit(false);
            String sql_delete = "delete from hero where id = ?";
            while (rs.next()){
                ps = c.prepareStatement(sql_delete);
                ps.setInt(1, rs.getInt(1));
                System.out.println("试图删除id = " + rs.getInt(1) + " 的数据");
                ps.executeUpdate();
            }
            System.out.println("是否删除:(Y/N)");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals("Y") || str.equals("N")){
                if (str.equals("Y")){
                    c.commit();
                    System.out.println("删除数据!");
                } else {
                    System.out.println("取消删除!");
                }
            } else {
                System.out.println("指令错误!");
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
