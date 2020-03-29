package java_basics.eight_date.Date;

import java.util.Date;

/**
 * getTime
 **/
public class TestDate_1 {
    public static void main(String[] args) {
        //java.util.Date  非java.sql.Date(此类是给数据库访问的时候使用的)
        Date now = new Date();
        System.out.println("当前时间：" + now.toString());

        //getTime()得到一个long整数
        //这个整数表示从1970.1.1 08:00:00:000到现在经历的毫秒数
        System.out.println("当前时间getTime()：" + now.getTime());

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:" + zero);
    }
} 
