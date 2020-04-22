package java_Senior.annotation.annotation_2;

/**
 * 注解方式DBUtil
 **/
@TestAnnotation_2(ip = "127.0.0.1",database = "test_jdbc",encoding = "UTF-8",loginName = "admin",password = "1999")
public class TestAnnotation_3 {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
