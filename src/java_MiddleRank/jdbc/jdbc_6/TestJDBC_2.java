package java_MiddleRank.jdbc.jdbc_6;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * 获取表的元数据
 * 元数据:
 *  数据库版本
 *  表
 *  表字段
 *  字段类型
 *  ...
 **/
public class TestJDBC_2 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","密码");

        DatabaseMetaData dbmd = c.getMetaData();

        //获取数据库服务器产品名称
        System.out.println("数据库服务器产品名称:\t" + dbmd.getDatabaseProductName());
        //获取数据库服务器产品版本号
        System.out.println("数据库产品版本:\t"+dbmd.getDatabaseProductVersion());
        //获取数据库服务器用作类别和表名之间的分隔符 如test.user
        System.out.println("数据库和表分隔符:\t"+dbmd.getCatalogSeparator());
        //获取驱动版本
        System.out.println("驱动版本:\t"+dbmd.getDriverVersion());

        System.out.println("可用的数据库列表: ");
        //获取数据库名称
        ResultSet rs = dbmd.getCatalogs();
        while (rs.next()){
            System.out.println("数据库名称:\t" + rs.getString(1));
        }

    }
} 
