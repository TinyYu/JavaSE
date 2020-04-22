package java_Senior.annotation.annotation_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 解析注解
 **/
@TestAnnotation_2(ip = "127.0.0.1",database = "test_jdbc",encoding = "UTF-8",loginName = "admin",password = "1999")
public class TestAnnotation_4 {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        //通过反射，获取这个DBUtil这个类上的注解对象
        TestAnnotation_2 testAnnotation_2 = TestAnnotation_4.class.getAnnotation(TestAnnotation_2.class);

        String ip = testAnnotation_2.ip();
        int port = testAnnotation_2.port();
        String database = testAnnotation_2.database();
        String encoding = testAnnotation_2.encoding();
        String loginName = testAnnotation_2.loginName();
        String password = testAnnotation_2.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s",ip,port,database,encoding);
        return DriverManager.getConnection(url,loginName,password);
    }

    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c);
    }
}
