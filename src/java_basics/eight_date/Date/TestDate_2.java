package java_basics.eight_date.Date;

import java.util.Date;

/**
 * System.currentTimeMillis()
 **/
public class TestDate_2 {
    public static void main(String[] args) {
        Date date = new Date();

        //getTime()当前时间毫秒数
        System.out.println("getTime:" + date.getTime());

        //System.currentTimeMillis当前时间毫秒数
        System.out.println("System.currentTimeMillis:" + System.currentTimeMillis());

    }
} 
