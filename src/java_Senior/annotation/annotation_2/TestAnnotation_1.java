package java_Senior.annotation.annotation_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 非注解方式DBUtil
 **/
public class TestAnnotation_1 {
    static String ip = "127.0.0.1";
    static int port = 3306;
    static String database = "test_jdbc";
    static String encoding = "UTF-8";
    static String loginName = "admin";
    static String password = "1999";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s",ip,port,database,encoding);
        return DriverManager.getConnection(url,loginName,password);
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}
